# Brain Challenge | تحدي الذكاء

A mobile-friendly Arabic and English puzzle game built with HTML, CSS, and vanilla JavaScript.

## Features

- Arabic and English interface and questions.
- 50 logic, math, and general reasoning puzzles.
- Three difficulty bands with level progression.
- Score, coin, hint, and progress tracking.
- Best score saved locally in the browser.
- Progressive Web App manifest and offline service worker.
- No account, server, or external JavaScript library required.

## Run locally

Open `index.html` in a browser. For install/offline testing, serve the folder over HTTPS or localhost so the service worker can register.

## GitHub Pages deployment

The workflow at `.github/workflows/pages.yml` validates the manifest, icon files, inline JavaScript syntax, and puzzle count. GitHub Pages publishes the `main` branch root automatically.

One-time repository setting:
1. Open **Settings → Pages**.
2. Under **Build and deployment → Source**, choose **Deploy from a branch**.
3. Select `main` and `/ (root)`, then save.
4. Pushes to `main` will trigger the Pages site update automatically.

Expected site address: https://khaled010094.github.io/brain-challenge/

## Install on Android

After GitHub Pages is live, open the site in Chrome on Android and use **Install app** or **Add to Home screen** from the browser menu. This installs the web app; it is not yet a Google Play Store release.

## Google Play status

A Play Store release still requires an Android package (AAB), a signing key, a Google Play Console developer account, store listing assets and policy declarations, and testing. These steps must be completed and approved before public release.

## Privacy

The game stores the best score in the browser's local storage. The current version does not include accounts, analytics, ads, or a remote leaderboard.
