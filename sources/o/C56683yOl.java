package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.InterfaceC59098zad;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yOl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56683yOl<T extends InterfaceC59098zad> {
    public static final /* synthetic */ yJA<java.lang.Object>[] EZpvd = {C56524yIo.copydefault(new PropertyReference1Impl(C56683yOl.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};
    public static final Activity OLrzqt = new Activity(null);
    public final Function1<AbstractC59287zeG, T> AEQbTJ;
    public final InterfaceC56658yNn KWHzl;
    public final AbstractC59287zeG copydefault;
    public final InterfaceC59182zcH djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.yNn), (r2v0 o.zcM), (r3v0 kotlin.jvm.functions.Function1), (r4v0 o.zeG) A[MD:(o.yNn, o.zcM, kotlin.jvm.functions.Function1<? super o.zeG, ? extends T extends o.zad>, o.zeG):void (m)] call: o.yOl.<init>(o.yNn, o.zcM, kotlin.jvm.functions.Function1, o.zeG):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C56683yOl(InterfaceC56658yNn interfaceC56658yNn, InterfaceC59187zcM interfaceC59187zcM, Function1 function1, AbstractC59287zeG abstractC59287zeG, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC56658yNn, interfaceC59187zcM, function1, abstractC59287zeG);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.zeG, ? extends T extends o.zad> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56683yOl(InterfaceC56658yNn interfaceC56658yNn, InterfaceC59187zcM interfaceC59187zcM, Function1<? super AbstractC59287zeG, ? extends T> function1, AbstractC59287zeG abstractC59287zeG) {
        this.KWHzl = interfaceC56658yNn;
        this.AEQbTJ = function1;
        this.copydefault = abstractC59287zeG;
        this.djBIcL = interfaceC59187zcM.KWHzl(new C56682yOk(this));
    }

    public final T KWHzl() {
        return (T) C59183zcI.AEQbTJ(this.djBIcL, this, EZpvd[0]);
    }

    public static final InterfaceC59098zad copydefault(C56683yOl c56683yOl) {
        return c56683yOl.AEQbTJ.invoke(c56683yOl.copydefault);
    }

    public final T OLrzqt(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        if (!abstractC59287zeG.KWHzl(yZE.AhwBna(this.KWHzl))) {
            return (T) KWHzl();
        }
        InterfaceC59315zei interfaceC59315zeiFJNWhG = this.KWHzl.fJNWhG();
        Intrinsics.checkNotNullExpressionValue(interfaceC59315zeiFJNWhG, "");
        return !abstractC59287zeG.copydefault(interfaceC59315zeiFJNWhG) ? (T) KWHzl() : (T) abstractC59287zeG.AEQbTJ(this.KWHzl, new C56681yOj(this, abstractC59287zeG));
    }

    public static final InterfaceC59098zad EZpvd(C56683yOl c56683yOl, AbstractC59287zeG abstractC59287zeG) {
        return c56683yOl.AEQbTJ.invoke(abstractC59287zeG);
    }

    /* JADX INFO: renamed from: o.yOl$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yOl.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final <T extends InterfaceC59098zad> C56683yOl<T> EZpvd(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull AbstractC59287zeG abstractC59287zeG, @NotNull Function1<? super AbstractC59287zeG, ? extends T> function1) {
            Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
            Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
            Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
            Intrinsics.checkNotNullParameter(function1, "");
            return new C56683yOl<>(interfaceC56658yNn, interfaceC59187zcM, function1, abstractC59287zeG, null);
        }
    }
}
