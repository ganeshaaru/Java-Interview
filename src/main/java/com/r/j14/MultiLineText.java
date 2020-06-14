package com.r.j14;

public class MultiLineText {
    public static void main(String[] args) {
        String multiLineText = """
                    <html>
                        <body>\
                            <p>Hello, '\s' World</p>\
                        </body>
                    </html>""";

        System.out.println(multiLineText);
    }
}
