package com.immomo.mls.view.hybrid;

import android.webkit.JavascriptInterface;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC7973att;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface IJsBridge {
    public static final Application Companion = Application.EZpvd;

    public interface Activity {
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void OLrzqt(@NotNull IJsBridge iJsBridge, @NotNull String str, @NotNull Function1<? super InterfaceC7973att, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
        }
    }

    void injectHtmlContent(InjectHtmlContentPayload injectHtmlContentPayload);

    @JavascriptInterface
    void invokeNativeApi(@NotNull String str, @NotNull String str2);

    void registerExtensionCallback(@NotNull String str, @NotNull Function1<? super InterfaceC7973att, Unit> function1);

    public static final class Application {
        public static final /* synthetic */ Application EZpvd = new Application();

        private Application() {
        }
    }

    public static final class InjectHtmlContentPayload implements Activity {
        public static final int $stable = 8;

        @SerializedName("htmlString")
        private final String htmlString;

        @SerializedName("imgConfigList")
        private final List<ImgConfig> imgConfigList;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.immomo.mls.view.hybrid.IJsBridge$InjectHtmlContentPayload */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InjectHtmlContentPayload copy$default(InjectHtmlContentPayload injectHtmlContentPayload, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = injectHtmlContentPayload.htmlString;
            }
            if ((i & 2) != 0) {
                list = injectHtmlContentPayload.imgConfigList;
            }
            return injectHtmlContentPayload.copy(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.htmlString;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<ImgConfig> component2() {
            return this.imgConfigList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InjectHtmlContentPayload copy(@NotNull String str, List<ImgConfig> list) {
            Intrinsics.checkNotNullParameter(str, "");
            return new InjectHtmlContentPayload(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InjectHtmlContentPayload)) {
                return false;
            }
            InjectHtmlContentPayload injectHtmlContentPayload = (InjectHtmlContentPayload) obj;
            return Intrinsics.EZpvd((Object) this.htmlString, (Object) injectHtmlContentPayload.htmlString) && Intrinsics.EZpvd(this.imgConfigList, injectHtmlContentPayload.imgConfigList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getHtmlString() {
            return this.htmlString;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<ImgConfig> getImgConfigList() {
            return this.imgConfigList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.htmlString.hashCode();
            List<ImgConfig> list = this.imgConfigList;
            return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "InjectHtmlContentPayload(htmlString=" + this.htmlString + ", imgConfigList=" + this.imgConfigList + ")";
        }

        public InjectHtmlContentPayload(@NotNull String str, List<ImgConfig> list) {
            Intrinsics.checkNotNullParameter(str, "");
            this.htmlString = str;
            this.imgConfigList = list;
        }

        public static final class ImgConfig {
            public static final int $stable = 0;

            @SerializedName("height")
            private final int height;

            @SerializedName("id")
            private final String id;

            @SerializedName("node")
            private final String node;

            @SerializedName("src")
            private final String src;

            @SerializedName("width")
            private final int width;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ImgConfig copy$default(ImgConfig imgConfig, String str, int i, int i2, String str2, String str3, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = imgConfig.src;
                }
                if ((i3 & 2) != 0) {
                    i = imgConfig.width;
                }
                int i4 = i;
                if ((i3 & 4) != 0) {
                    i2 = imgConfig.height;
                }
                int i5 = i2;
                if ((i3 & 8) != 0) {
                    str2 = imgConfig.id;
                }
                String str4 = str2;
                if ((i3 & 16) != 0) {
                    str3 = imgConfig.node;
                }
                return imgConfig.copy(str, i4, i5, str4, str3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.src;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int component2() {
                return this.width;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int component3() {
                return this.height;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component4() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component5() {
                return this.node;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ImgConfig copy(@NotNull String str, int i, int i2, String str2, String str3) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ImgConfig(str, i, i2, str2, str3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ImgConfig)) {
                    return false;
                }
                ImgConfig imgConfig = (ImgConfig) obj;
                return Intrinsics.EZpvd((Object) this.src, (Object) imgConfig.src) && this.width == imgConfig.width && this.height == imgConfig.height && Intrinsics.EZpvd((Object) this.id, (Object) imgConfig.id) && Intrinsics.EZpvd((Object) this.node, (Object) imgConfig.node);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getHeight() {
                return this.height;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getNode() {
                return this.node;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSrc() {
                return this.src;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getWidth() {
                return this.width;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.src.hashCode();
                int iHashCode2 = Integer.hashCode(this.width);
                int iHashCode3 = Integer.hashCode(this.height);
                String str = this.id;
                int iHashCode4 = str == null ? 0 : str.hashCode();
                String str2 = this.node;
                return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ImgConfig(src=" + this.src + ", width=" + this.width + ", height=" + this.height + ", id=" + this.id + ", node=" + this.node + ")";
            }

            public ImgConfig(@NotNull String str, int i, int i2, String str2, String str3) {
                Intrinsics.checkNotNullParameter(str, "");
                this.src = str;
                this.width = i;
                this.height = i2;
                this.id = str2;
                this.node = str3;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 int)
  (r10v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, int, int, java.lang.String, java.lang.String):void (m)] (LINE:38) call: com.immomo.mls.view.hybrid.IJsBridge.InjectHtmlContentPayload.ImgConfig.<init>(java.lang.String, int, int, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ ImgConfig(String str, int i, int i2, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i, i2, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : str3);
            }
        }
    }
}
