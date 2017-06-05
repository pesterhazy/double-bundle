# double-bundle

Demonstration of the "double-bundle" approach to integrating NPM dependencies into ClojureScript projects

## Overview

You can integrate NPM dependencies in a Clojurescript project by building a separate bundle using webpack. The resulting application contains two bundles:

- `js/npm-bundle.js`, built by webpack
- `js/compiled/double_bundle.js`, built by the Clojurescript compiler (and Google Closure)

Hence the name - the double bundle approach.

## Details

This project is built on Reagent and Figwheel. Note, however, that neither of these are essential - a similar approach would work for any browser-based Clojurescript project that consumes NPM dependencies.

To show how to include third party React dependencies, this project includes the [react-datetime](https://github.com/YouCanBookMe/react-datetime) calendar component.

## Setup

To see the demo, run this:

```shell
yarn install
yarn build
lein figwheel
```

Then open your browser at [localhost:3449](http://localhost:3449/).

## Discussion

This project is based on fighweel-template. To see the changes from an empty fighwheel template, see this [diff view](https://github.com/pesterhazy/double-bundle/compare/init...master).

For simplicity, we're not making use of the `npm-deps` feature included in recent versions of the Clojurescript compiler here. The Google Closure compiler is not involved. The upside of this choice is that any NPM packages should work, as long as it is added to `library.js`.

Similarly, for the sake of operational simplicity, we don't provide an externs files for an external component. Instead, we [use `goog.object/get`](https://github.com/pesterhazy/double-bundle/blob/8b523a9c774fb04635a01a85940f62217bb84d09/src/double_bundle/core.cljs#L14) to retrieve the component while avoiding minification during Advanced Compilation.

## TODO

- Show how to build a single prod bundle
- Does Reagent require externs in advanced compilation?

## License

Copyright © 2017 Paulus Esterhazy

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
