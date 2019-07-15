package com.tws.refactoring.extract_variable;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class BannerRenderTest {

    @Test
    void should_return_IE_on_Mac_when_renderBanner_given_String_Macta_and_rie(){
//        given
        BannerRender bannerRender = new BannerRender();
        String platform = "Macta";
        String brower = "ire";
        String expected = "IE_on_Mac?";

//    when
        String result = bannerRender.renderBanner(platform,brower);

//    then
        Assertions.assertEquals(result,expected);
    }



}

