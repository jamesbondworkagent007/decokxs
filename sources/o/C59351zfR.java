package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.util.CheckResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59351zfR {
    public final Regex AEQbTJ;
    public final java.util.Collection<C56935yXu> EZpvd;
    public final InterfaceC59353zfT[] KWHzl;
    public final Function1<yNG, java.lang.String> OLrzqt;
    public final C56935yXu copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.yNG, java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59351zfR(C56935yXu c56935yXu, Regex regex, java.util.Collection<C56935yXu> collection, Function1<? super yNG, java.lang.String> function1, InterfaceC59353zfT... interfaceC59353zfTArr) {
        this.copydefault = c56935yXu;
        this.AEQbTJ = regex;
        this.EZpvd = collection;
        this.OLrzqt = function1;
        this.KWHzl = interfaceC59353zfTArr;
    }

    public final boolean AEQbTJ(@NotNull yNG yng) {
        Intrinsics.checkNotNullParameter(yng, "");
        if (this.copydefault != null && !Intrinsics.EZpvd(yng.bR_(), this.copydefault)) {
            return false;
        }
        if (this.AEQbTJ != null) {
            java.lang.String strAEQbTJ = yng.bR_().AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            if (!this.AEQbTJ.matches(strAEQbTJ)) {
                return false;
            }
        }
        java.util.Collection<C56935yXu> collection = this.EZpvd;
        return collection == null || collection.contains(yng.bR_());
    }

    public final kotlin.reflect.jvm.internal.impl.util.CheckResult KWHzl(@NotNull yNG yng) {
        Intrinsics.checkNotNullParameter(yng, "");
        for (InterfaceC59353zfT interfaceC59353zfT : this.KWHzl) {
            java.lang.String strKWHzl = interfaceC59353zfT.KWHzl(yng);
            if (strKWHzl != null) {
                return new CheckResult.Activity(strKWHzl);
            }
        }
        java.lang.String strInvoke = this.OLrzqt.invoke(yng);
        if (strInvoke != null) {
            return new CheckResult.Activity(strInvoke);
        }
        return CheckResult.StateListAnimator.OLrzqt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 o.yXu)
  (r2v0 o.zfT[])
  (wrap:kotlin.jvm.functions.Function1<? super o.yNG, java.lang.String>:?: CAST (kotlin.jvm.functions.Function1<? super o.yNG, java.lang.String>) (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0004: SGET  A[WRAPPED] (LINE:158) o.zfR.4.EZpvd o.zfR$4) : (r3v0 kotlin.jvm.functions.Function1)))
 A[MD:(o.yXu, o.zfT[], kotlin.jvm.functions.Function1<? super o.yNG, java.lang.String>):void (m)] (LINE:158) call: o.zfR.<init>(o.yXu, o.zfT[], kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C59351zfR(C56935yXu c56935yXu, InterfaceC59353zfT[] interfaceC59353zfTArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c56935yXu, interfaceC59353zfTArr, (Function1<? super yNG, java.lang.String>) ((i & 4) != 0 ? new Function1() { // from class: o.zfR.4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public final java.lang.Void invoke(yNG yng) {
                Intrinsics.checkNotNullParameter(yng, "");
                return null;
            }
        } : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59351zfR(@NotNull C56935yXu c56935yXu, @NotNull InterfaceC59353zfT[] interfaceC59353zfTArr, @NotNull Function1<? super yNG, java.lang.String> function1) {
        this(c56935yXu, (Regex) null, (java.util.Collection<C56935yXu>) null, function1, (InterfaceC59353zfT[]) java.util.Arrays.copyOf(interfaceC59353zfTArr, interfaceC59353zfTArr.length));
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(interfaceC59353zfTArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 kotlin.text.Regex)
  (r2v0 o.zfT[])
  (wrap:kotlin.jvm.functions.Function1<? super o.yNG, java.lang.String>:?: CAST (kotlin.jvm.functions.Function1<? super o.yNG, java.lang.String>) (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0004: SGET  A[WRAPPED] (LINE:161) o.zfR.3.KWHzl o.zfR$3) : (r3v0 kotlin.jvm.functions.Function1)))
 A[MD:(kotlin.text.Regex, o.zfT[], kotlin.jvm.functions.Function1<? super o.yNG, java.lang.String>):void (m)] (LINE:161) call: o.zfR.<init>(kotlin.text.Regex, o.zfT[], kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C59351zfR(Regex regex, InterfaceC59353zfT[] interfaceC59353zfTArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(regex, interfaceC59353zfTArr, (Function1<? super yNG, java.lang.String>) ((i & 4) != 0 ? new Function1() { // from class: o.zfR.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public final java.lang.Void invoke(yNG yng) {
                Intrinsics.checkNotNullParameter(yng, "");
                return null;
            }
        } : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59351zfR(@NotNull Regex regex, @NotNull InterfaceC59353zfT[] interfaceC59353zfTArr, @NotNull Function1<? super yNG, java.lang.String> function1) {
        this((C56935yXu) null, regex, (java.util.Collection<C56935yXu>) null, function1, (InterfaceC59353zfT[]) java.util.Arrays.copyOf(interfaceC59353zfTArr, interfaceC59353zfTArr.length));
        Intrinsics.checkNotNullParameter(regex, "");
        Intrinsics.checkNotNullParameter(interfaceC59353zfTArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.util.Collection<o.yXu>:?: CAST (java.util.Collection<o.yXu>) (r1v0 java.util.Collection))
  (r2v0 o.zfT[])
  (wrap:kotlin.jvm.functions.Function1<? super o.yNG, java.lang.String>:?: CAST (kotlin.jvm.functions.Function1<? super o.yNG, java.lang.String>) (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.jvm.functions.Function1:0x0004: SGET  A[WRAPPED] (LINE:164) o.zfR.2.EZpvd o.zfR$2) : (r3v0 kotlin.jvm.functions.Function1)))
 A[MD:(java.util.Collection<o.yXu>, o.zfT[], kotlin.jvm.functions.Function1<? super o.yNG, java.lang.String>):void (m)] (LINE:164) call: o.zfR.<init>(java.util.Collection, o.zfT[], kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C59351zfR(java.util.Collection collection, InterfaceC59353zfT[] interfaceC59353zfTArr, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((java.util.Collection<C56935yXu>) collection, interfaceC59353zfTArr, (Function1<? super yNG, java.lang.String>) ((i & 4) != 0 ? new Function1() { // from class: o.zfR.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public final java.lang.Void invoke(yNG yng) {
                Intrinsics.checkNotNullParameter(yng, "");
                return null;
            }
        } : function1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C59351zfR(@NotNull java.util.Collection<C56935yXu> collection, @NotNull InterfaceC59353zfT[] interfaceC59353zfTArr, @NotNull Function1<? super yNG, java.lang.String> function1) {
        this((C56935yXu) null, (Regex) null, collection, function1, (InterfaceC59353zfT[]) java.util.Arrays.copyOf(interfaceC59353zfTArr, interfaceC59353zfTArr.length));
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(interfaceC59353zfTArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
    }
}
