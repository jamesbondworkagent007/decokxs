package com.okinc.nft.ui.kline;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.mls.fun.ud.view.UDView;
import com.okinc.nft.ui.kline.MLNPixelLineChart;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C33129mqd;
import o.C33492mxV;
import o.C33512mxp;
import o.C43471rps;
import o.C7594aml;
import o.C7865arr;
import o.C7910asj;
import o.InterfaceC60044zuT;
import o.oXM;
import o.oXO;
import o.oXR;
import o.oXS;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC60044zuT
public final class MLNPixelLineChart extends UDView<View> {
    public oXM AhwBna;
    public LuaFunction EZpvd;
    public boolean KWHzl;
    public oXR copydefault;
    public LuaFunction djBIcL;
    public LuaFunction gEmmrt;
    public boolean valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public static final String[] OLrzqt = {"setAnimate", "isFoldedState", "setDisplayOption", "setMapFunction", "setDataFormat", "setTimeFormat", "loadData", "setPixelColor", "setDrawOption"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final String AEQbTJ(TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final String copydefault(TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        return "";
    }

    @InterfaceC60044zuT
    public MLNPixelLineChart(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.AhwBna = oXM.Companion.OLrzqt();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.nft.ui.kline.MLNPixelLineChart.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final String[] AEQbTJ() {
            return MLNPixelLineChart.OLrzqt;
        }
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public View AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        int i = C43471rps.TaskDescription.valueOf;
        if ((!(luaValueArr.length == 0)) && luaValueArr[0].isBoolean() && luaValueArr[0].toBoolean()) {
            i = C43471rps.TaskDescription.AhwBna;
        }
        View viewInflate = LayoutInflater.from(AubY()).inflate(i, (ViewGroup) null, false);
        this.copydefault = (oXR) viewInflate.findViewById(C43471rps.Activity.fIwbmz);
        Intrinsics.copydefault(viewInflate, "");
        ((ViewGroup) viewInflate).removeAllViews();
        oXR oxr = this.copydefault;
        Intrinsics.copydefault(oxr);
        return oxr;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setDisplayOption(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        final Ref.IntRef intRef = new Ref.IntRef();
        C7594aml.EZpvd(luaValueArr, 0, (Function1<? super Integer, Unit>) new Function1() { // from class: o.rsD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPixelLineChart.gEmmrt(intRef, ((java.lang.Integer) obj).intValue());
            }
        });
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 1);
        int iCopydefault = (luaValue == null || !luaValue.isNumber()) ? 0 : C7865arr.copydefault(luaValue.toFloat());
        if (intRef.element != 0 && iCopydefault != 0) {
            this.AhwBna = new oXM(intRef.element, iCopydefault, null, 4, null);
        }
        return LuaValue.varargsOf(this);
    }

    public static final Unit gEmmrt(Ref.IntRef intRef, int i) {
        intRef.element = i;
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setPixelColor(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (luaValueArr.length == 0) {
            return null;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        final Ref.IntRef intRef3 = new Ref.IntRef();
        intRef3.element = -1;
        final Ref.IntRef intRef4 = new Ref.IntRef();
        intRef4.element = -1;
        final Ref.IntRef intRef5 = new Ref.IntRef();
        intRef5.element = -1;
        final Ref.IntRef intRef6 = new Ref.IntRef();
        intRef6.element = -1;
        C7594aml.EZpvd(luaValueArr, 0, (Function1<? super Integer, Unit>) new Function1() { // from class: o.rsE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPixelLineChart.valueOf(intRef, ((java.lang.Integer) obj).intValue());
            }
        });
        C7594aml.EZpvd(luaValueArr, 1, (Function1<? super Integer, Unit>) new Function1() { // from class: o.rsH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPixelLineChart.isConnected(intRef2, ((java.lang.Integer) obj).intValue());
            }
        });
        if (intRef2.element == -1) {
            intRef2.element = intRef.element;
        }
        C7594aml.EZpvd(luaValueArr, 2, (Function1<? super Integer, Unit>) new Function1() { // from class: o.rsK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPixelLineChart.DbNXlk(intRef3, ((java.lang.Integer) obj).intValue());
            }
        });
        if (intRef3.element == -1) {
            intRef3.element = intRef.element;
        }
        C7594aml.EZpvd(luaValueArr, 3, (Function1<? super Integer, Unit>) new Function1() { // from class: o.rsL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPixelLineChart.AkhnZx(intRef4, ((java.lang.Integer) obj).intValue());
            }
        });
        if (intRef4.element == -1) {
            intRef4.element = intRef.element;
        }
        C7594aml.EZpvd(luaValueArr, 4, (Function1<? super Integer, Unit>) new Function1() { // from class: o.rsJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPixelLineChart.values(intRef5, ((java.lang.Integer) obj).intValue());
            }
        });
        if (intRef5.element == -1) {
            intRef5.element = intRef.element;
        }
        C7594aml.EZpvd(luaValueArr, 5, (Function1<? super Integer, Unit>) new Function1() { // from class: o.rsI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPixelLineChart.djBIcL(intRef6, ((java.lang.Integer) obj).intValue());
            }
        });
        if (intRef6.element == -1) {
            intRef6.element = intRef.element;
        }
        oXR oxr = this.copydefault;
        if (oxr != null) {
            oxr.setDrawOption(new oXS(intRef.element, intRef2.element, intRef3.element, intRef4.element, intRef5.element, intRef6.element, 0, 0, 192, null));
        }
        return LuaValue.varargsOf(this);
    }

    public static final Unit valueOf(Ref.IntRef intRef, int i) {
        intRef.element = i;
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(Ref.IntRef intRef, int i) {
        intRef.element = i;
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(Ref.IntRef intRef, int i) {
        intRef.element = i;
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(Ref.IntRef intRef, int i) {
        intRef.element = i;
        return Unit.INSTANCE;
    }

    public static final Unit values(Ref.IntRef intRef, int i) {
        intRef.element = i;
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(Ref.IntRef intRef, int i) {
        intRef.element = i;
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setMapFunction(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessFunction$default(luaValueArr, 0, new Function1() { // from class: o.rsA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPixelLineChart.EZpvd(this.OLrzqt, (LuaFunction) obj);
            }
        }, 1, null);
        return LuaValue.varargsOf(this);
    }

    public static final Unit EZpvd(MLNPixelLineChart mLNPixelLineChart, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        mLNPixelLineChart.gEmmrt = luaFunction;
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setDataFormat(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessFunction$default(luaValueArr, 0, new Function1() { // from class: o.rsB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPixelLineChart.copydefault(this.copydefault, (LuaFunction) obj);
            }
        }, 1, null);
        return LuaValue.varargsOf(this);
    }

    public static final Unit copydefault(MLNPixelLineChart mLNPixelLineChart, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        mLNPixelLineChart.EZpvd = luaFunction;
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setTimeFormat(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        C7594aml.safeAccessFunction$default(luaValueArr, 0, new Function1() { // from class: o.rsM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPixelLineChart.AhwBna(this.AEQbTJ, (LuaFunction) obj);
            }
        }, 1, null);
        return LuaValue.varargsOf(this);
    }

    public static final Unit AhwBna(MLNPixelLineChart mLNPixelLineChart, LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(luaFunction, "");
        mLNPixelLineChart.djBIcL = luaFunction;
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] loadData(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        final ArrayList arrayList = new ArrayList();
        C7594aml.safeAccessTable$default(luaValueArr, 0, new Function1() { // from class: o.rsQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MLNPixelLineChart.copydefault(arrayList, (LuaTable) obj);
            }
        }, 1, null);
        oXR oxr = this.copydefault;
        if (oxr != null) {
            oxr.setData(arrayList, this.KWHzl, this.valueOf, oXM.Companion.OLrzqt(), new Function1() { // from class: o.rsy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Float.valueOf(MLNPixelLineChart.copydefault(this.AEQbTJ, (MLNPixelLineChart.TaskDescription) obj));
                }
            }, this.EZpvd != null ? new Function1() { // from class: o.rsC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MLNPixelLineChart.AEQbTJ(this.EZpvd, (MLNPixelLineChart.TaskDescription) obj);
                }
            } : new Function1() { // from class: o.rsz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MLNPixelLineChart.AEQbTJ((MLNPixelLineChart.TaskDescription) obj);
                }
            }, this.djBIcL != null ? new Function1() { // from class: o.rsG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MLNPixelLineChart.valueOf(this.EZpvd, (MLNPixelLineChart.TaskDescription) obj);
                }
            } : new Function1() { // from class: o.rsF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MLNPixelLineChart.copydefault((MLNPixelLineChart.TaskDescription) obj);
                }
            });
        }
        return LuaValue.varargsOf(this);
    }

    public static final Unit copydefault(List list, LuaTable luaTable) {
        Intrinsics.checkNotNullParameter(luaTable, "");
        List listCopydefault = C7910asj.copydefault(luaTable);
        Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
        for (Object obj : listCopydefault) {
            HashMap map = obj instanceof HashMap ? (HashMap) obj : null;
            if (map != null) {
                list.add(new TaskDescription(C33129mqd.gEmmrt(map.get("dateString")), C33129mqd.djBIcL(map.get("value")), C33129mqd.gEmmrt(map.get("valueString"))));
            }
        }
        return Unit.INSTANCE;
    }

    public static final float copydefault(MLNPixelLineChart mLNPixelLineChart, TaskDescription taskDescription) {
        LuaValue[] luaValueArrInvoke;
        LuaValue luaValue;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        LuaFunction luaFunction = mLNPixelLineChart.gEmmrt;
        if (luaFunction == null) {
            return taskDescription.KWHzl();
        }
        if (luaFunction == null || (luaValueArrInvoke = luaFunction.invoke(LuaValue.rNumber(taskDescription.KWHzl()))) == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArrInvoke, 0)) == null || !luaValue.isNumber()) {
            return 0.0f;
        }
        return luaValue.toFloat();
    }

    public static final String AEQbTJ(MLNPixelLineChart mLNPixelLineChart, TaskDescription taskDescription) {
        LuaValue[] luaValueArrInvoke;
        LuaValue luaValue;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        LuaFunction luaFunction = mLNPixelLineChart.EZpvd;
        if (luaFunction == null || (luaValueArrInvoke = luaFunction.invoke(LuaValue.rNumber(taskDescription.KWHzl()))) == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArrInvoke, 0)) == null || !luaValue.isString()) {
            return "";
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        return javaString;
    }

    public static final String valueOf(MLNPixelLineChart mLNPixelLineChart, TaskDescription taskDescription) {
        LuaValue[] luaValueArrInvoke;
        LuaValue luaValue;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        LuaFunction luaFunction = mLNPixelLineChart.djBIcL;
        if (luaFunction == null || (luaValueArrInvoke = luaFunction.invoke(LuaValue.rString(C33129mqd.gEmmrt(taskDescription.AEQbTJ())))) == null || (luaValue = (LuaValue) yDV.gEmmrt(luaValueArrInvoke, 0)) == null || !luaValue.isString()) {
            return "";
        }
        String javaString = luaValue.toJavaString();
        Intrinsics.checkNotNullExpressionValue(javaString, "");
        return javaString;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public void valueOf(int i) {
        oXR oxr = this.copydefault;
        if (oxr != null) {
            Intrinsics.copydefault(oxr);
            oxr.setBackgroundColor(i);
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription {
        public final float AEQbTJ;
        public final String KWHzl;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, float f, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.KWHzl;
            }
            if ((i & 2) != 0) {
                f = taskDescription.AEQbTJ;
            }
            if ((i & 4) != 0) {
                str2 = taskDescription.copydefault;
            }
            return taskDescription.AEQbTJ(str, f, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(@NotNull String str, float f, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TaskDescription(str, f, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) taskDescription.KWHzl) && Float.compare(this.AEQbTJ, taskDescription.AEQbTJ) == 0 && Intrinsics.EZpvd((Object) this.copydefault, (Object) taskDescription.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + Float.hashCode(this.AEQbTJ)) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PixelPoint(dateString=" + this.KWHzl + ", value=" + this.AEQbTJ + ", valueString=" + this.copydefault + ")";
        }

        public TaskDescription(@NotNull String str, float f, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.KWHzl = str;
            this.AEQbTJ = f;
            this.copydefault = str2;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setAnimate(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isBoolean()) {
            this.KWHzl = luaValue.toBoolean();
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public final LuaValue[] isFoldedState(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isBoolean()) {
            this.valueOf = luaValue.toBoolean();
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public final LuaValue[] setDrawOption(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue != null && luaValue.isBoolean()) {
            boolean z = luaValue.toBoolean();
            oXR oxr = this.copydefault;
            if (oxr != null) {
                oxr.setDrawOption(oXO.AEQbTJ.AEQbTJ(!C33492mxV.OLrzqt(), C33512mxp.AEQbTJ.isConnected() == 0, z));
            }
        }
        return LuaValue.varargsOf(this);
    }
}
