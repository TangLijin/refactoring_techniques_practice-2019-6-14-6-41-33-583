package com.tws.refactoring.extract_variable;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BannerRenderTest {
    static BannerRender bannerRender;

    @BeforeAll
    public void init(){
        bannerRender = new BannerRender();
    }

    @Test
    public void should_return_IE_on_Mac_when_renderBanner_given_String_Macta_and_rie(){
//        given
        String platform = "Macta";
        String brower = "ier";
        String expected = "IE on Mac?";

//    when
        String result = bannerRender.renderBanner(platform,brower);

//    then
        Assertions.assertEquals(result,expected);
    }

    @Test
    public void should_return_banner_on_Mac_when_renderBanner_given_String_Macta_and_re() {
//        given
        String platform = "Macta";
        String brower = "re";
        String expected = "banner";

//    when
        String result = bannerRender.renderBanner(platform, brower);

//    then
        Assertions.assertEquals(result, expected);

    }
}

