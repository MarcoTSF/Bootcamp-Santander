class   Cardnews extends HTMLElement {
    constructor() {
        super();

        const shadow = this.attachShadow({ mode: "open" });
        shadow.appendChild(this.build());
        shadow.appendChild(this.styles());
    }

    build() {
        const componentRoot = document.createElement("div");
        componentRoot.setAttribute("class", "card");

        const cardLeft = document.createElement("div");
        cardLeft.setAttribute("class", "card_left");

        const autor = document.createElement("span");
        autor.textContent = "By " + (this.getAttribute("autor") || "Anonymous");

        const linkTitle = document.createElement("a");
        linkTitle.textContent = this.getAttribute("title");
        linkTitle.href = this.getAttribute("link-url");
        linkTitle.target = this.getAttribute("target");

        const newsContent = document.createElement("p");
        newsContent.textContent = this.getAttribute("content");

        cardLeft.appendChild(autor);
        cardLeft.appendChild(linkTitle);
        cardLeft.appendChild(newsContent);

        const cardRight = document.createElement("div");
        cardRight.setAttribute("class", "card_right");

        const newsImage = document.createElement("img");
        newsImage.src = this.getAttribute("image-url") || "./assets/default-image.jpg";
        newsImage.alt = "Imagem Darth Vader";
        cardRight.appendChild(newsImage);
        
        componentRoot.appendChild(cardLeft);
        componentRoot.appendChild(cardRight);

        return componentRoot;
    }

    styles() {
        const style = document.createElement("style");
        style.textContent = `
            .card {
                width: 1000px;
                height: 200px;
                margin-top: 100px;
                border: 1px solid gray;
                display: flex;
                flex-direction: row;
                justify-content: space-between;
                -webkit-box-shadow: 11px 13px 19px -1px rgba(0,0,0,0.75);
                -moz-box-shadow: 11px 13px 19px -1px rgba(0,0,0,0.75);
                box-shadow: 11px 13px 19px -1px rgba(0,0,0,0.75);
            }
            
            .card_left {
                display: flex;
                flex-direction: column;
                justify-content: center;
                padding-left: 10px;
            }
            
            .card_left > span {
                font-weight: 500;
            }
            
            .card_left > a {
                margin-top: 15px;
                font-size: 25px;
                text-decoration: none;
                font-weight: 700;
                color: #000000;
            }
            
            .card_left > p {
                color: rgb(63, 63, 63);
            }
            
            .card_right img {
                width: 300px;
                height: 200px;
            }
        `;

        return style;
    }
}

customElements.define("card-news", Cardnews);