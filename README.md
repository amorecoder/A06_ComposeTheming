# A06_ComposeTheming

This project is part of the Jetpack Compose CodeLab series tutorial to better understand and learn about Jetpack Compose.
In this project our focus is to learn about Material Theming using Jetpack Compose.

Jetpack Compose offers an implementation of Material Design—a comprehensive design system for creating digital interfaces. The Material Design components (Buttons, Cards, Switches etc) are built on top of Material Theming which is a systematic way to customize Material Design to better reflect your product's brand. A Material Theme comprises color, typography and shape attributes. Customizing these will be automatically reflected in the components you use to build your app.

Color
Material Design defines a number of semantically named colors which you can use throughout your app. Primary is your main brand color and secondary is used to provide accents. You can supply darker/lighter variants for contrasting areas. Background and surface colors are used for containers holding components which notionally live on a "surface" in your application. Material also defines "on" colors—colors to use for content on top of one of the named colors e.g. text in a ‘surface' colored container should be colored ‘on surface'. Material components are configured to use these theme colors, for example by default a Floating Action Button is colored secondary, Cards default to surface etc. By defining named colors, it becomes possible to provide alternate color palettes such as both a light and a dark theme. It also encourages you to define a small palette of colors and use them consistently throughout your app. The Material color tool [https://material.io/resources/color/] can help to pick colors and create a color palette, even ensuring that the combinations are accessible.

Typography
While you may not vary type styles by theme, using a type scale will promote consistency within your application. Supplying your own fonts and other type customizations will be reflected in Material components you use in your app e.g. App Bars use h6 style by default, Buttons use, err, button. The Material type scale generator tool [https://material.io/design/typography/the-type-system.html#type-scale] can help you to build your type scale.

Shape
Material supports using shapes systematically to convey your brand. It defines 3 categories: small, medium and large components; each of which can define a shape to use, customizing the corner style (cut or rounded) and size. Customizing your shape theme will be reflected across numerous components e.g. Buttons & Text Fields use the small shape theme, Cards and Dialogs use medium and Sheets use the large shape theme by default. There is a complete mapping of components to shape themes here: https://material.io/design/shape/applying-shape-to-ui.html#shape-scheme. The Material shape customization tool [https://material.io/design/shape/about-shape.html#shape-customization-tool] can help you generate a shape theme. 

Baseline
Material defaults to a "baseline" theme, that is the purple color scheme, Roboto type scale and slightly rounded shapes. If you do not specify or customize your theme then components will use the baseline theme.

Note on Color
1. To convert color values from the common ‘#dd0d3c' format for specifying colors, replace the ‘#' with ‘0xff' i.e. Color(0xffdd0d3c) where ‘ff' means full alpha.
2. When defining colors, we name them "literally", based on the color value, rather than "semantically" e.g. Red500 not primary. This enables us to define multiple themes e.g. another color might be considered primary in dark theme or on a differently styled screen.
3. If your brand doesn't have separate primary and secondary colors, then it's fine to supply the same color for both.

Note on Typography
1. In Compose we can define TextStyle objects to define the information needed to style some text.


Dark Theme
Supporting a dark theme in your app not only helps your app to integrate better on users' devices (which have a global dark theme toggle from Android 10 onward) but also can reduce power usage and support accessibility needs. Material offers design guidance [https://material.io/design/color/dark-theme.html] on creating a dark theme.
