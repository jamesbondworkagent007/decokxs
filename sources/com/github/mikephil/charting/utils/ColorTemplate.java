package com.github.mikephil.charting.utils;

import android.content.res.Resources;
import android.graphics.Color;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.ui.liveness.state.FreshnessState;
import com.flyco.tablayout.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes14.dex */
public class ColorTemplate {
    public static final int COLOR_NONE = 1122867;
    public static final int COLOR_SKIP = 1122868;
    public static final int[] LIBERTY_COLORS = {Color.rgb(207, 248, 246), Color.rgb(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, BuildConfig.VERSION_CODE, BuildConfig.VERSION_CODE), Color.rgb(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA, 180, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256), Color.rgb(118, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384), Color.rgb(42, 109, 130)};
    public static final int[] JOYFUL_COLORS = {Color.rgb(217, 80, 138), Color.rgb(254, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA, 7), Color.rgb(254, 247, 120), Color.rgb(106, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384, 134), Color.rgb(53, CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256, 209)};
    public static final int[] PASTEL_COLORS = {Color.rgb(64, 89, 128), Color.rgb(CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA, CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384, 124), Color.rgb(217, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256, CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256), Color.rgb(191, 134, 134), Color.rgb(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 48, 80)};
    public static final int[] COLORFUL_COLORS = {Color.rgb(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, 37, 82), Color.rgb(255, 102, 0), Color.rgb(245, 199, 0), Color.rgb(106, 150, 31), Color.rgb(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 100, 53)};
    public static final int[] VORDIPLOM_COLORS = {Color.rgb(192, 255, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA), Color.rgb(255, 247, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA), Color.rgb(255, 208, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA), Color.rgb(CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, 234, 255), Color.rgb(255, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384)};
    public static final int[] MATERIAL_COLORS = {rgb("#2ecc71"), rgb("#f1c40f"), rgb("#e74c3c"), rgb("#3498db")};

    public static int colorWithAlpha(int i, int i2) {
        return (i & 16777215) | ((i2 & 255) << 24);
    }

    public static int rgb(String str) {
        int i = (int) Long.parseLong(str.replace(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER, ""), 16);
        return Color.rgb((i >> 16) & 255, (i >> 8) & 255, i & 255);
    }

    public static int getHoloBlue() {
        return Color.rgb(51, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, FreshnessState.FIRST_SCENE_ALPHA);
    }

    public static List<Integer> createColors(Resources resources, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(resources.getColor(i)));
        }
        return arrayList;
    }

    public static List<Integer> createColors(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }
}
