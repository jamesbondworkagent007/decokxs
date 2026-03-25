package o;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.UDStyleString;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.aml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7594aml {
    public static /* synthetic */ LuaValue safeGet$default(LuaValue[] luaValueArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return copydefault(luaValueArr, i);
    }

    public static final LuaValue copydefault(@NotNull LuaValue[] luaValueArr, int i) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue == null || Intrinsics.EZpvd(luaValue, LuaValue.Nil())) {
            return null;
        }
        return luaValue;
    }

    public static /* synthetic */ int safeGetInt$default(LuaValue[] luaValueArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return KWHzl(luaValueArr, i, i2);
    }

    public static final int KWHzl(@NotNull LuaValue[] luaValueArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        return (luaValue == null || !luaValue.isInt()) ? i2 : luaValue.toInt();
    }

    public static /* synthetic */ long safeGetLong$default(LuaValue[] luaValueArr, int i, long j, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            j = 0;
        }
        return AEQbTJ(luaValueArr, i, j);
    }

    public static final long AEQbTJ(@NotNull LuaValue[] luaValueArr, int i, long j) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        return (luaValue == null || !luaValue.isNumber()) ? j : luaValue.toLong();
    }

    public static /* synthetic */ float safeGetFloat$default(LuaValue[] luaValueArr, int i, float f, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return EZpvd(luaValueArr, i, f);
    }

    public static final float EZpvd(@NotNull LuaValue[] luaValueArr, int i, float f) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        return (luaValue == null || !luaValue.isInt()) ? f : luaValue.toFloat();
    }

    public static /* synthetic */ boolean safeGetBoolean$default(LuaValue[] luaValueArr, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return copydefault(luaValueArr, i, z);
    }

    public static final boolean copydefault(@NotNull LuaValue[] luaValueArr, int i, boolean z) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        return (luaValue == null || !luaValue.isBoolean()) ? z : luaValue.toBoolean();
    }

    public static /* synthetic */ java.lang.String safeGetJavaString$default(LuaValue[] luaValueArr, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        return AEQbTJ(luaValueArr, i, str);
    }

    public static final java.lang.String AEQbTJ(@NotNull LuaValue[] luaValueArr, int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue == null || !luaValue.isString()) {
            return str;
        }
        java.lang.String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        return javaString;
    }

    public static /* synthetic */ LuaFunction safeGetFunction$default(LuaValue[] luaValueArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return EZpvd(luaValueArr, i);
    }

    public static final LuaFunction EZpvd(@NotNull LuaValue[] luaValueArr, int i) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        return luaValue.toLuaFunction();
    }

    public static /* synthetic */ android.view.View safeGetView$default(LuaValue[] luaValueArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return AEQbTJ(luaValueArr, i);
    }

    public static final android.view.View AEQbTJ(@NotNull LuaValue[] luaValueArr, int i) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue != null) {
            return (android.view.View) C8017aul.AEQbTJ(luaValue, android.view.View.class);
        }
        return null;
    }

    public static /* synthetic */ void safeAccess$default(LuaValue[] luaValueArr, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        KWHzl(luaValueArr, i, (Function1<? super LuaValue, Unit>) function1);
    }

    public static final void KWHzl(@NotNull LuaValue[] luaValueArr, int i, @NotNull Function1<? super LuaValue, Unit> function1) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue == null || Intrinsics.EZpvd(luaValue, LuaValue.Nil())) {
            return;
        }
        function1.invoke(luaValue);
    }

    public static /* synthetic */ void safeAccessInt$default(LuaValue[] luaValueArr, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue == null || !luaValue.isInt()) {
            return;
        }
        function1.invoke(java.lang.Integer.valueOf(luaValue.toInt()));
    }

    public static /* synthetic */ void safeAccessLong$default(LuaValue[] luaValueArr, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue == null || !luaValue.isNumber()) {
            return;
        }
        function1.invoke(java.lang.Long.valueOf(luaValue.toLong()));
    }

    public static /* synthetic */ void safeAccessFloat$default(LuaValue[] luaValueArr, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue == null || !luaValue.isNumber()) {
            return;
        }
        function1.invoke(java.lang.Float.valueOf(luaValue.toFloat()));
    }

    public static /* synthetic */ void safeAccessBoolean$default(LuaValue[] luaValueArr, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue == null || !luaValue.isBoolean()) {
            return;
        }
        function1.invoke(java.lang.Boolean.valueOf(luaValue.toBoolean()));
    }

    public static /* synthetic */ void accessJavaString$default(LuaValue[] luaValueArr, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue != null && luaValue.isString()) {
            function1.invoke(luaValue.toJavaString());
        } else {
            function1.invoke(null);
        }
    }

    public static /* synthetic */ void safeAccessJavaString$default(LuaValue[] luaValueArr, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue == null || !luaValue.isString()) {
            return;
        }
        java.lang.String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        function1.invoke(javaString);
    }

    public static /* synthetic */ void safeAccessFunction$default(LuaValue[] luaValueArr, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        AEQbTJ(luaValueArr, i, (Function1<? super LuaFunction, Unit>) function1);
    }

    public static final void AEQbTJ(@NotNull LuaValue[] luaValueArr, int i, @NotNull Function1<? super LuaFunction, Unit> function1) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue == null || !luaValue.isFunction()) {
            return;
        }
        LuaFunction luaFunction = luaValue.toLuaFunction();
        Intrinsics.checkNotNullExpressionValue(luaFunction, "");
        function1.invoke(luaFunction);
    }

    public static /* synthetic */ void safeAccessTable$default(LuaValue[] luaValueArr, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        djBIcL(luaValueArr, i, function1);
    }

    public static final void djBIcL(@NotNull LuaValue[] luaValueArr, int i, @NotNull Function1<? super LuaTable, Unit> function1) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue == null || !luaValue.isTable()) {
            return;
        }
        LuaTable luaTable = luaValue.toLuaTable();
        Intrinsics.copydefault(luaTable);
        function1.invoke(luaTable);
        luaTable.destroy();
    }

    public static /* synthetic */ void safeAccessView$default(LuaValue[] luaValueArr, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        AhwBna(luaValueArr, i, function1);
    }

    public static final void AhwBna(@NotNull LuaValue[] luaValueArr, int i, @NotNull Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue != null) {
            java.lang.Object objAEQbTJ = C8017aul.AEQbTJ(luaValue, (java.lang.Class<java.lang.Object>) android.view.View.class);
            Intrinsics.copydefault(objAEQbTJ, "");
            function1.invoke((android.view.View) objAEQbTJ);
        }
    }

    public static /* synthetic */ void safeAccessColor$default(LuaValue[] luaValueArr, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        EZpvd(luaValueArr, i, (Function1<? super java.lang.Integer, Unit>) function1);
    }

    public static final void EZpvd(@NotNull LuaValue[] luaValueArr, int i, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        UDColor uDColor;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue == null || (uDColor = (UDColor) C8017aul.AEQbTJ(luaValue, UDColor.class)) == null) {
            return;
        }
        function1.invoke(java.lang.Integer.valueOf(uDColor.copydefault()));
        luaValue.destroy();
    }

    public static /* synthetic */ void accessImage$default(LuaValue[] luaValueArr, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        OLrzqt(luaValueArr, i, (Function1<? super JDImageInfo, Unit>) function1);
    }

    public static final void OLrzqt(@NotNull LuaValue[] luaValueArr, int i, @NotNull Function1<? super JDImageInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue != null) {
            UDImageInfo uDImageInfo = (UDImageInfo) C8017aul.AEQbTJ(luaValue, UDImageInfo.class);
            if (uDImageInfo != null) {
                function1.invoke(uDImageInfo.EZpvd());
                luaValue.destroy();
            } else {
                function1.invoke(null);
            }
        }
    }

    public static /* synthetic */ void safeAccessImage$default(LuaValue[] luaValueArr, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        copydefault(luaValueArr, i, (Function1<? super JDImageInfo, Unit>) function1);
    }

    public static final void copydefault(@NotNull LuaValue[] luaValueArr, int i, @NotNull final Function1<? super JDImageInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        accessImage$default(luaValueArr, 0, new Function1() { // from class: o.amv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7594aml.EZpvd(function1, (JDImageInfo) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(Function1 function1, JDImageInfo jDImageInfo) {
        if (jDImageInfo != null) {
            function1.invoke(jDImageInfo);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void loadImage$default(LuaValue[] luaValueArr, android.content.Context context, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        OLrzqt(luaValueArr, context, i, (Function1<? super android.graphics.drawable.Drawable, Unit>) function1);
    }

    public static final void OLrzqt(@NotNull LuaValue[] luaValueArr, @NotNull final android.content.Context context, int i, final Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt(luaValueArr, i, (Function1<? super JDImageInfo, Unit>) new Function1() { // from class: o.ami
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7594aml.OLrzqt(context, function1, (JDImageInfo) obj);
            }
        });
    }

    public static final Unit OLrzqt(android.content.Context context, final Function1 function1, JDImageInfo jDImageInfo) {
        if (jDImageInfo != null) {
            C7911ask.OLrzqt(context, jDImageInfo, new InterfaceC7852are() { // from class: o.amw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC7852are
                public final void copydefault(android.graphics.drawable.Drawable drawable, java.lang.String str) {
                    C7594aml.KWHzl(function1, drawable, str);
                }
            });
        } else if (function1 != null) {
            function1.invoke(null);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, android.graphics.drawable.Drawable drawable, java.lang.String str) {
        if (function1 != null) {
            function1.invoke(drawable);
        }
    }

    public static /* synthetic */ void safeLoadImage$default(LuaValue[] luaValueArr, android.content.Context context, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        AEQbTJ(luaValueArr, context, i, (Function1<? super android.graphics.drawable.Drawable, Unit>) function1);
    }

    public static final void AEQbTJ(@NotNull LuaValue[] luaValueArr, @NotNull android.content.Context context, int i, final Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(context, "");
        OLrzqt(luaValueArr, context, i, (Function1<? super android.graphics.drawable.Drawable, Unit>) new Function1() { // from class: o.amo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7594aml.copydefault(function1, (android.graphics.drawable.Drawable) obj);
            }
        });
    }

    public static final Unit copydefault(Function1 function1, android.graphics.drawable.Drawable drawable) {
        if (drawable != null && function1 != null) {
            function1.invoke(drawable);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void loadImage$default(LuaValue[] luaValueArr, android.widget.ImageView imageView, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        AEQbTJ(luaValueArr, imageView, i, (Function1<? super android.graphics.drawable.Drawable, Unit>) function1);
    }

    public static final void AEQbTJ(@NotNull LuaValue[] luaValueArr, @NotNull final android.widget.ImageView imageView, int i, final Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(imageView, "");
        OLrzqt(luaValueArr, i, (Function1<? super JDImageInfo, Unit>) new Function1() { // from class: o.amr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7594aml.AEQbTJ(imageView, function1, (JDImageInfo) obj);
            }
        });
    }

    public static final Unit AEQbTJ(final android.widget.ImageView imageView, final Function1 function1, JDImageInfo jDImageInfo) {
        if (jDImageInfo != null) {
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C7911ask.OLrzqt(context, jDImageInfo, new InterfaceC7852are() { // from class: o.amj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC7852are
                public final void copydefault(android.graphics.drawable.Drawable drawable, java.lang.String str) {
                    C7594aml.EZpvd(imageView, function1, drawable, str);
                }
            });
        } else {
            imageView.setImageDrawable(null);
            if (function1 != null) {
                function1.invoke(null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(android.widget.ImageView imageView, Function1 function1, android.graphics.drawable.Drawable drawable, java.lang.String str) {
        imageView.setImageDrawable(drawable);
        if (function1 != null) {
            function1.invoke(drawable);
        }
    }

    public static /* synthetic */ void safeLoadImage$default(LuaValue[] luaValueArr, android.widget.ImageView imageView, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        KWHzl(luaValueArr, imageView, i, function1);
    }

    public static final void KWHzl(@NotNull LuaValue[] luaValueArr, @NotNull android.widget.ImageView imageView, int i, final Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(imageView, "");
        AEQbTJ(luaValueArr, imageView, i, (Function1<? super android.graphics.drawable.Drawable, Unit>) new Function1() { // from class: o.amn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7594aml.KWHzl(function1, (android.graphics.drawable.Drawable) obj);
            }
        });
    }

    public static final Unit KWHzl(Function1 function1, android.graphics.drawable.Drawable drawable) {
        if (drawable != null && function1 != null) {
            function1.invoke(drawable);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void safeAccessUserData$default(LuaValue[] luaValueArr, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue != null) {
            Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
            java.lang.Object objAEQbTJ = C8017aul.AEQbTJ(luaValue, (java.lang.Class<java.lang.Object>) java.lang.Object.class);
            if (objAEQbTJ != null) {
                function1.invoke(objAEQbTJ);
                luaValue.destroy();
            }
        }
    }

    public static /* synthetic */ void safeAccessTypes$default(LuaValue[] luaValueArr, java.lang.Integer[] numArr, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        OLrzqt(luaValueArr, numArr, i, (Function1<? super java.lang.Integer, Unit>) function1);
    }

    public static /* synthetic */ void safeSetStyleText$default(android.widget.TextView textView, LuaValue[] luaValueArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        KWHzl(textView, luaValueArr, i);
    }

    public static final void KWHzl(@NotNull final android.widget.TextView textView, @NotNull LuaValue[] luaValueArr, int i) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        KWHzl(luaValueArr, i, (Function1<? super LuaValue, Unit>) new Function1() { // from class: o.amq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C7594aml.KWHzl(textView, (LuaValue) obj);
            }
        });
    }

    public static final Unit KWHzl(android.widget.TextView textView, LuaValue luaValue) {
        Intrinsics.checkNotNullParameter(luaValue, "");
        if (luaValue instanceof UDStyleString) {
            UDStyleString uDStyleString = (UDStyleString) luaValue;
            textView.setText(uDStyleString.copydefault());
            textView.setMovementMethod(C7351aiG.copydefault());
            textView.setOnTouchListener(new View.OnTouchListener() { // from class: o.amp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return C7594aml.OLrzqt(view, motionEvent);
                }
            });
            uDStyleString.destroy();
        }
        return Unit.INSTANCE;
    }

    public static final boolean OLrzqt(android.view.View view, android.view.MotionEvent motionEvent) {
        android.widget.TextView textView;
        android.text.method.MovementMethod movementMethod;
        if (!(view instanceof android.widget.TextView) || (movementMethod = (textView = (android.widget.TextView) view).getMovementMethod()) == null || !(textView.getText() instanceof android.text.Spannable) || motionEvent.getAction() != 1) {
            return false;
        }
        java.lang.CharSequence text = textView.getText();
        Intrinsics.copydefault(text, "");
        if (!movementMethod.onTouchEvent(textView, (android.text.Spannable) text, motionEvent)) {
            return false;
        }
        motionEvent.setAction(3);
        return false;
    }

    public static final java.lang.String copydefault(@NotNull Globals globals) {
        Intrinsics.checkNotNullParameter(globals, "");
        InterfaceC60037zuM interfaceC60037zuMAuCTel = globals.AuCTel();
        if (!(interfaceC60037zuMAuCTel instanceof C7322ahe)) {
            return "";
        }
        java.lang.String strOLrzqt = ((C7322ahe) interfaceC60037zuMAuCTel).copydefault.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
        return strOLrzqt;
    }

    public static final android.content.Context AEQbTJ(Globals globals) {
        InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
        if (interfaceC60037zuMAuCTel instanceof C7322ahe) {
            return ((C7322ahe) interfaceC60037zuMAuCTel).AEQbTJ;
        }
        return null;
    }

    public static final void OLrzqt(@NotNull LuaValue[] luaValueArr, @NotNull java.lang.Integer[] numArr, int i, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        java.lang.Integer num;
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Intrinsics.checkNotNullParameter(numArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, i);
        if (luaValue == null || !luaValue.isInt() || (num = (java.lang.Integer) yDV.gEmmrt(numArr, luaValue.toInt())) == null) {
            return;
        }
        function1.invoke(java.lang.Integer.valueOf(num.intValue()));
    }
}
