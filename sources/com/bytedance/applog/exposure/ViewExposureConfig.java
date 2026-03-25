package com.bytedance.applog.exposure;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewExposureConfig implements IExposureConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f112a;
    public final Boolean b;
    public final long c;
    public final Function1<ViewExposureParam, Boolean> d;

    public static final class a extends Lambda implements Function1<ViewExposureParam, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f113a = new a();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a() {
            super(1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public Boolean invoke(ViewExposureParam viewExposureParam) {
            Intrinsics.EZpvd((Object) viewExposureParam, "");
            return Boolean.TRUE;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ViewExposureConfig() {
        this(null, null, 0L, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ViewExposureConfig(Float f) {
        this(f, null, 0L, null, 14, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ViewExposureConfig(Float f, Boolean bool) {
        this(f, bool, 0L, null, 12, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ViewExposureConfig(Float f, Boolean bool, long j) {
        this(f, bool, j, null, 8, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.bytedance.applog.exposure.ViewExposureParam, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public ViewExposureConfig(Float f, Boolean bool, long j, @NotNull Function1<? super ViewExposureParam, Boolean> function1) {
        Intrinsics.EZpvd((Object) function1, "");
        this.f112a = f;
        this.b = bool;
        this.c = j;
        this.d = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r4v0 java.lang.Float))
  (wrap:java.lang.Boolean:0x000b: TERNARY null = ((wrap:int:0x0005: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0009: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r5v0 java.lang.Boolean))
  (wrap:long:0x0012: TERNARY null = ((wrap:int:0x000c: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r6v0 long))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0013: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0017: SGET  A[WRAPPED] com.bytedance.applog.exposure.ViewExposureConfig.a.a com.bytedance.applog.exposure.ViewExposureConfig$a) : (r8v0 kotlin.jvm.functions.Function1))
 A[MD:(java.lang.Float, java.lang.Boolean, long, kotlin.jvm.functions.Function1<? super com.bytedance.applog.exposure.ViewExposureParam, java.lang.Boolean>):void (m)] call: com.bytedance.applog.exposure.ViewExposureConfig.<init>(java.lang.Float, java.lang.Boolean, long, kotlin.jvm.functions.Function1):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ViewExposureConfig(Float f, Boolean bool, long j, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? a.f113a : function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.applog.exposure.ViewExposureConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewExposureConfig copy$default(ViewExposureConfig viewExposureConfig, Float f, Boolean bool, long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = viewExposureConfig.f112a;
        }
        if ((i & 2) != 0) {
            bool = viewExposureConfig.b;
        }
        Boolean bool2 = bool;
        if ((i & 4) != 0) {
            j = viewExposureConfig.c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            function1 = viewExposureConfig.d;
        }
        return viewExposureConfig.copy(f, bool2, j2, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component1() {
        return this.f112a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<ViewExposureParam, Boolean> component4() {
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewExposureConfig copy(Float f, Boolean bool, long j, @NotNull Function1<? super ViewExposureParam, Boolean> function1) {
        Intrinsics.EZpvd((Object) function1, "");
        return new ViewExposureConfig(f, bool, j, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewExposureConfig)) {
            return false;
        }
        ViewExposureConfig viewExposureConfig = (ViewExposureConfig) obj;
        return Intrinsics.EZpvd(this.f112a, viewExposureConfig.f112a) && Intrinsics.EZpvd(this.b, viewExposureConfig.b) && this.c == viewExposureConfig.c && Intrinsics.EZpvd(this.d, viewExposureConfig.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getAreaRatio() {
        return this.f112a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<ViewExposureParam, Boolean> getExposureCallback() {
        return this.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getStayTriggerTime() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getVisualDiagnosis() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Float f = this.f112a;
        int iHashCode = f != null ? f.hashCode() : 0;
        Boolean bool = this.b;
        int iHashCode2 = bool != null ? bool.hashCode() : 0;
        long j = this.c;
        int i = (int) (j ^ (j >>> 32));
        Function1<ViewExposureParam, Boolean> function1 = this.d;
        return (((((iHashCode * 31) + iHashCode2) * 31) + i) * 31) + (function1 != null ? function1.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        StringBuilder sbA = com.bytedance.bdtracker.a.a("ViewExposureConfig(areaRatio=");
        sbA.append(this.f112a);
        sbA.append(", visualDiagnosis=");
        sbA.append(this.b);
        sbA.append(", stayTriggerTime=");
        sbA.append(this.c);
        sbA.append(", exposureCallback=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
