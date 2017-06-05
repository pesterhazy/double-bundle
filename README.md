# double-bundle

Demonstration of the "double-bundle" approach to integrating NPM dependencies into ClojureScript projects

## Overview

You can integrate NPM dependencies in a Clojurescript project by building a separate bundle using webpack. The resulting application contains two bundles:

- `js/npm-bundle.js`, built by webpack
- `js/compiled/double_bundle.js`, built by the Clojurescript compiler (and Google Closure)

Hence the name - the double bundle approach.

## Details

To show how to include third party React dependencies, this project includes the [react-datetime](https://github.com/YouCanBookMe/react-datetime) calendar component.

## Setup

To see the demo, run this:

```shell
yarn install
yarn build
lein figwheel
```

Then open your browser at [localhost:3449](http://localhost:3449/).

## TODO

- Show how to build a single prod bundle
- Handle advanced compilation and externs

## License

Copyright © 2017 Paulus Esterhazy

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
