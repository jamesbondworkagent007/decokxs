package com.reown.android.internal.common.explorer.data.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class App {

    /* JADX INFO: renamed from: android, reason: collision with root package name */
    public final String f1047android;
    public final String browser;
    public final String chrome;
    public final String edge;
    public final String firefox;
    public final String ios;
    public final String linux;
    public final String mac;
    public final String opera;
    public final String safari;
    public final String windows;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.browser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.edge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.opera;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ios;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.f1047android;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.mac;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.windows;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.linux;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.chrome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.firefox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.safari;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final App copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        return new App(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof App)) {
            return false;
        }
        App app2 = (App) obj;
        return Intrinsics.EZpvd((Object) this.browser, (Object) app2.browser) && Intrinsics.EZpvd((Object) this.ios, (Object) app2.ios) && Intrinsics.EZpvd((Object) this.f1047android, (Object) app2.f1047android) && Intrinsics.EZpvd((Object) this.mac, (Object) app2.mac) && Intrinsics.EZpvd((Object) this.windows, (Object) app2.windows) && Intrinsics.EZpvd((Object) this.linux, (Object) app2.linux) && Intrinsics.EZpvd((Object) this.chrome, (Object) app2.chrome) && Intrinsics.EZpvd((Object) this.firefox, (Object) app2.firefox) && Intrinsics.EZpvd((Object) this.safari, (Object) app2.safari) && Intrinsics.EZpvd((Object) this.edge, (Object) app2.edge) && Intrinsics.EZpvd((Object) this.opera, (Object) app2.opera);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAndroid() {
        return this.f1047android;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrowser() {
        return this.browser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChrome() {
        return this.chrome;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEdge() {
        return this.edge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFirefox() {
        return this.firefox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIos() {
        return this.ios;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLinux() {
        return this.linux;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMac() {
        return this.mac;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpera() {
        return this.opera;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafari() {
        return this.safari;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWindows() {
        return this.windows;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.browser;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.ios;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f1047android;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.mac;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.windows;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.linux;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.chrome;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.firefox;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.safari;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.edge;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.opera;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "App(browser=" + this.browser + ", ios=" + this.ios + ", android=" + this.f1047android + ", mac=" + this.mac + ", windows=" + this.windows + ", linux=" + this.linux + ", chrome=" + this.chrome + ", firefox=" + this.firefox + ", safari=" + this.safari + ", edge=" + this.edge + ", opera=" + this.opera + ")";
    }

    public App(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.browser = str;
        this.ios = str2;
        this.f1047android = str3;
        this.mac = str4;
        this.windows = str5;
        this.linux = str6;
        this.chrome = str7;
        this.firefox = str8;
        this.safari = str9;
        this.edge = str10;
        this.opera = str11;
    }
}
