package o;

import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tPB implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get(AppsFlyerProperties.CHANNEL);
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.String strGEmmrt = str != null ? C33129mqd.gEmmrt(str) : null;
        java.lang.Object obj2 = map.get("location");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.String strGEmmrt2 = str2 != null ? C33129mqd.gEmmrt(str2) : null;
        java.lang.Object obj3 = map.get("uniqueName");
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.String strGEmmrt3 = str3 != null ? C33129mqd.gEmmrt(str3) : null;
        java.lang.Object obj4 = map.get("uid");
        java.lang.String str4 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        java.lang.String strGEmmrt4 = str4 != null ? C33129mqd.gEmmrt(str4) : null;
        java.lang.Object obj5 = map.get("authorId");
        java.lang.String str5 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        java.lang.String strGEmmrt5 = str5 != null ? C33129mqd.gEmmrt(str5) : null;
        pUU.KWHzl("qjf", "uniqueName = " + strGEmmrt3 + " ,uid=" + strGEmmrt4 + " ,authorId=" + strGEmmrt5);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt3)) {
            tWL twl = (tWL) C43251rlk.copydefault(tWL.class);
            Intrinsics.copydefault((java.lang.Object) strGEmmrt3);
            twl.KWHzl(context, "", "", strGEmmrt3, C33129mqd.gEmmrt(strGEmmrt), C33129mqd.gEmmrt(strGEmmrt2));
        } else if (C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt4)) {
            tWL twl2 = (tWL) C43251rlk.copydefault(tWL.class);
            Intrinsics.copydefault((java.lang.Object) strGEmmrt4);
            twl2.KWHzl(context, strGEmmrt4, "", "", C33129mqd.gEmmrt(strGEmmrt), C33129mqd.gEmmrt(strGEmmrt2));
        } else {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt5)) {
                tWL twl3 = (tWL) C43251rlk.copydefault(tWL.class);
                Intrinsics.copydefault((java.lang.Object) strGEmmrt5);
                twl3.KWHzl(context, "", strGEmmrt5, "", C33129mqd.gEmmrt(strGEmmrt), C33129mqd.gEmmrt(strGEmmrt2));
                return;
            }
            ((tWL) C43251rlk.copydefault(tWL.class)).copydefault(context, C33129mqd.gEmmrt(strGEmmrt), C33129mqd.gEmmrt(strGEmmrt2));
        }
    }
}
