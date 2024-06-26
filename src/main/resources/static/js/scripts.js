document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('contactForm');

    if (form) {
        form.addEventListener('submit', function(event) {
            event.preventDefault();

            const name = document.getElementById('name').value;
            const email = document.getElementById('email').value;
            const message = document.getElementById('message').value;
            const category = document.getElementById('category').value;

            const nameRegex = /^[a-zA-Z\s]+$/;
            const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

            if (!nameRegex.test(name)) {
                alert('Please enter a valid name.');
                return;
            }

            if (!emailRegex.test(email)) {
                alert('Please enter a valid email address.');
                return;
            }

            alert('Form submitted successfully!');

            form.reset();
        });
    }

    const articles = [
        { title: "News Article 3", date: "2024-06-03", summary: "Brief summary of the news article 3...", image: "image3.jpg" },
        { title: "News Article 4", date: "2024-06-04", summary: "Brief summary of the news article 4...", image: "image4.jpg" },
        { title: "News Article 5", date: "2024-06-05", summary: "Brief summary of the news article 5...", image: "image5.jpg" }
    ];

    const loadMoreBtn = document.getElementById('loadMoreBtn');
    const cardContainer = document.querySelector('.card-container');
    const newsListTable = document.querySelector('.news-list table tbody');

    if (loadMoreBtn) {
        loadMoreBtn.addEventListener('click', function() {
            articles.forEach(article => {
                // Add to table
                const row = document.createElement('tr');
                const titleCell = document.createElement('td');
                const dateCell = document.createElement('td');
                const summaryCell = document.createElement('td');

                titleCell.textContent = article.title;
                dateCell.textContent = article.date;
                summaryCell.textContent = article.summary;

                row.appendChild(titleCell);
                row.appendChild(dateCell);
                row.appendChild(summaryCell);
                newsListTable.appendChild(row);

                // Add to card
                const card = document.createElement('div');
                card.className = 'card';

                const img = document.createElement('img');
                img.src = article.image;
                img.alt = article.title;

                const cardContent = document.createElement('div');
                cardContent.className = 'card-content';

                const h3 = document.createElement('h3');
                h3.textContent = article.title;

                const p = document.createElement('p');
                p.textContent = article.summary;

                cardContent.appendChild(h3);
                cardContent.appendChild(p);
                card.appendChild(img);
                card.appendChild(cardContent);

                cardContainer.appendChild(card);
            });

            loadMoreBtn.style.display = 'none';
        });
    }
});
