# Katalon

## Katalon CLI

```shell
./katalonc -noSplash  -runMode=console -projectPath="<Path to project *.prj file>" -retry=0 -testSuitePath="Test Suites/<TEST-SUITE-NAME>" -browserType="Chrome"
```

```shell
-reportFloder="Reports" -reportFileName="report" -retry=0 -testSuitePath="Test Suites/<TEST-SUITE-NAME>" -browserType="Chrome"
```

## Running katalon test inside Docker

```shell
docker run -t --rm -v ${PWD}:/tmp/project katalonstudio/katalon katalonc.sh -projectPath=/tmp/project -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/<TEST-SUITE-NAME>" -apiKey="<KATALON-API-KEY>"
```

### Proxy information for docker

Below configuration can be added to docker run command in case proxy configuration needs to be added

```shell
-e HTTP_PROXY=http://<USER-NAME>:<PASSWORD>@<HOST>:<PORT> -e HTTPS_PROXY=https://<USER-NAME>:<PASSWORD>@<HOST>:<PORT>
```