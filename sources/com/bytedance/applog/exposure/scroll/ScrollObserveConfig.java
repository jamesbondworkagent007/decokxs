package com.bytedance.applog.exposure.scroll;

import com.bytedance.applog.exposure.IExposureConfig;
import com.bytedance.applog.exposure.ViewExposureParam;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ScrollObserveConfig implements IExposureConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f118a;
    public final Function1<ViewExposureParam, Boolean> b;

    public static final class a extends Lambda implements Function1<ViewExposureParam, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f119a = new a();

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
    public ScrollObserveConfig() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ScrollObserveConfig(int i) {
        this(i, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.bytedance.applog.exposure.ViewExposureParam, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollObserveConfig(int i, @NotNull Function1<? super ViewExposureParam, Boolean> function1) {
        Intrinsics.EZpvd((Object) function1, "");
        this.f118a = i;
        this.b = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (30 int) : (r1v0 int))
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x000a: SGET  A[WRAPPED] com.bytedance.applog.exposure.scroll.ScrollObserveConfig.a.a com.bytedance.applog.exposure.scroll.ScrollObserveConfig$a) : (r2v0 kotlin.jvm.functions.Function1))
 A[MD:(int, kotlin.jvm.functions.Function1<? super com.bytedance.applog.exposure.ViewExposureParam, java.lang.Boolean>):void (m)] call: com.bytedance.applog.exposure.scroll.ScrollObserveConfig.<init>(int, kotlin.jvm.functions.Function1):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ScrollObserveConfig(int i, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 30 : i, (i2 & 2) != 0 ? a.f119a : function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.applog.exposure.scroll.ScrollObserveConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScrollObserveConfig copy$default(ScrollObserveConfig scrollObserveConfig, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = scrollObserveConfig.f118a;
        }
        if ((i2 & 2) != 0) {
            function1 = scrollObserveConfig.b;
        }
        return scrollObserveConfig.copy(i, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.f118a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<ViewExposureParam, Boolean> component2() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ScrollObserveConfig copy(int i, @NotNull Function1<? super ViewExposureParam, Boolean> function1) {
        Intrinsics.EZpvd((Object) function1, "");
        return new ScrollObserveConfig(i, function1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollObserveConfig)) {
            return false;
        }
        ScrollObserveConfig scrollObserveConfig = (ScrollObserveConfig) obj;
        return this.f118a == scrollObserveConfig.f118a && Intrinsics.EZpvd(this.b, scrollObserveConfig.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMinOffset() {
        return this.f118a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<ViewExposureParam, Boolean> getScrollCallback() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int i = this.f118a;
        Function1<ViewExposureParam, Boolean> function1 = this.b;
        return (i * 31) + (function1 != null ? function1.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        StringBuilder sbA = com.bytedance.bdtracker.a.a("ScrollObserveConfig(minOffset=");
        sbA.append(this.f118a);
        sbA.append(", scrollCallback=");
        sbA.append(this.b);
        sbA.append(")");
        return sbA.toString();
    }
}
