# Selenium Download Test

This project demonstrates a simple automation test using Selenium WebDriver to download a file and verify its presence in the download directory.

## Task

- Go to a URL
- Click on a link
- It opens a pdf in a new tab
- download the pdf and download verify the path

##Challenges

- cannot use 𝐂𝐡𝐫𝐨𝐦𝐞𝐎𝐩𝐭𝐢𝐨𝐧𝐬,𝐅𝐢𝐫𝐞𝐟𝐨𝐱𝐎𝐩𝐭𝐢𝐨𝐧𝐬 and 𝐊𝐞𝐲𝐛𝐨𝐚𝐫𝐝 𝐬𝐡𝐨𝐫𝐭𝐜𝐮𝐭𝐬 - 𝐊𝐞𝐲𝐄𝐯𝐞𝐧𝐭𝐬

## Requirements

- Java
- Selenium
- TestNG
- Maven

## Setup

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/selenium-download-test.git
   ```

2. **Import Project:**
   Import the cloned project into the preferred Java IDE.

3. **Library Dependencies:**
   Need to add the necessary Selenium WebDriver and TestNG dependencies to the maven POM file.

## Running the Test

1. Open the project in a Java IDE.
2. Navigate to the `DownloadTest` class.
3. Run the test method `downloadAndVerify()`.
4. The test will open a Chrome browser, navigate to a webpage, download a PDF file, and verify its presence in the specified directory.

## Customization

- **WebDriver Configuration:** Modify the WebDriver setup in the `setup()` method of the `DownloadTest` class to use a different browser or adjust browser settings.
- **File Download Location:** Change the download directory path in the `downloadAndVerify()` method to match the system's download directory.

## Contributors

- [Minhazul Billah](https://github.com/570n3)
