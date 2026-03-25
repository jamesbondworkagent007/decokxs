package o;

import android.graphics.Color;
import android.os.Build;
import androidx.appcompat.app.AppCompatActivity;
import com.immomo.mls.InitData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rjl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43146rjl {
    public static final void EZpvd(@NotNull InitData initData, @NotNull AppCompatActivity appCompatActivity, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        int localNightMode;
        Intrinsics.checkNotNullParameter(initData, "");
        Intrinsics.checkNotNullParameter(appCompatActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.lang.Object obj = initData.KWHzl.get("forceNavMode");
        if (obj == null) {
            obj = "";
        }
        java.lang.String str = (java.lang.String) obj;
        java.lang.Object obj2 = initData.KWHzl.get("navigationBarColor");
        java.lang.String str2 = (java.lang.String) (obj2 != null ? obj2 : "");
        int color = appCompatActivity.getColor(C52761wXj.Activity.EZpvd);
        if (!android.text.TextUtils.isEmpty(str2)) {
            color = Color.parseColor(str2);
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "dark") || (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "light") && (localNightMode = appCompatActivity.getDelegate().getLocalNightMode()) != 1 && (localNightMode == 2 || C7911ask.AEQbTJ((android.content.Context) appCompatActivity)))) {
            function1.invoke(java.lang.Integer.valueOf(color));
        } else if (Build.VERSION.SDK_INT < 26) {
            function1.invoke(java.lang.Integer.valueOf(appCompatActivity.getColor(C32113mPz.ActionBar.AEQbTJ)));
        } else {
            function1.invoke(java.lang.Integer.valueOf(color));
        }
    }

    public static final android.util.SparseArray<C33510mxn> copydefault(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "alternative")) {
            return C33503mxg.AEQbTJ();
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "alternativeweb3")) {
            return C33503mxg.EZpvd();
        }
        return null;
    }

    public static final java.lang.Integer AEQbTJ(java.lang.String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 110760) {
                if (iHashCode != 3645279) {
                    if (iHashCode == 1989774883 && str.equals("exchange")) {
                        return java.lang.Integer.valueOf(C52761wXj.LoaderManager.fERRXa);
                    }
                } else if (str.equals("web3")) {
                    return java.lang.Integer.valueOf(C52761wXj.LoaderManager.fdOvFl);
                }
            } else if (str.equals("pay")) {
                return java.lang.Integer.valueOf(C52761wXj.LoaderManager.igXuih);
            }
        }
        return null;
    }
}
