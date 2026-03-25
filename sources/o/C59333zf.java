package o;

import aws.smithy.kotlin.runtime.config.EnvironmentSettingKt$boolEnvSetting$1;
import aws.smithy.kotlin.runtime.config.EnvironmentSettingKt$intEnvSetting$1;
import aws.smithy.kotlin.runtime.config.EnvironmentSettingKt$longEnvSetting$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C59492zi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C59333zf {
    public static final Function2<java.lang.String, java.lang.String, C59492zi<java.lang.String>> AEQbTJ;
    public static final Function2<java.lang.String, java.lang.String, C59492zi<java.lang.Boolean>> EZpvd;
    public static final Function2<java.lang.String, java.lang.String, C59492zi<java.lang.Long>> KWHzl;
    public static final Function2<java.lang.String, java.lang.String, C59492zi<java.lang.Integer>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Function2<java.lang.String, java.lang.String, C59492zi<java.lang.Boolean>> AEQbTJ() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Function2<java.lang.String, java.lang.String, C59492zi<java.lang.Long>> EZpvd() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Function2<java.lang.String, java.lang.String, C59492zi<java.lang.String>> OLrzqt() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Function2<java.lang.String, java.lang.String, C59492zi<java.lang.Integer>> copydefault() {
        return OLrzqt;
    }

    public static /* synthetic */ java.lang.Object resolve$default(C59492zi c59492zi, HM hm, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            hm = HL.OLrzqt.copydefault();
        }
        return AEQbTJ(c59492zi, hm);
    }

    public static final <T> T AEQbTJ(@NotNull C59492zi<T> c59492zi, @NotNull HM hm) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(c59492zi, "");
        Intrinsics.checkNotNullParameter(hm, "");
        java.lang.String strOLrzqt = hm.OLrzqt(c59492zi.EZpvd());
        if (strOLrzqt == null) {
            strOLrzqt = hm.EZpvd(c59492zi.OLrzqt());
        }
        return (strOLrzqt == null || (tInvoke = c59492zi.KWHzl().invoke(strOLrzqt)) == null) ? c59492zi.copydefault() : tInvoke;
    }

    static {
        C59492zi.ActionBar actionBar = C59492zi.AEQbTJ;
        EZpvd = actionBar.copydefault(EnvironmentSettingKt$boolEnvSetting$1.INSTANCE);
        OLrzqt = actionBar.copydefault(EnvironmentSettingKt$intEnvSetting$1.INSTANCE);
        KWHzl = actionBar.copydefault(EnvironmentSettingKt$longEnvSetting$1.INSTANCE);
        AEQbTJ = actionBar.copydefault(new Function1<java.lang.String, java.lang.String>() { // from class: aws.smithy.kotlin.runtime.config.EnvironmentSettingKt$strEnvSetting$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return str;
            }
        });
    }
}
