package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C5114Fg;
import o.C5123Fp;
import o.C5129Fv;
import o.C56455yG;
import o.InterfaceC5132Fy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5121Fn implements InterfaceC5097Ep {
    public final C5101Et EZpvd;
    public final boolean KWHzl;
    public final InterfaceC5132Fy OLrzqt;
    public final C5130Fw copydefault;

    public C5121Fn(@NotNull C5101Et c5101Et, @NotNull InterfaceC5132Fy interfaceC5132Fy, @NotNull C5130Fw c5130Fw, boolean z) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(interfaceC5132Fy, "");
        Intrinsics.checkNotNullParameter(c5130Fw, "");
        this.EZpvd = c5101Et;
        this.OLrzqt = interfaceC5132Fy;
        this.copydefault = c5130Fw;
        this.KWHzl = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.Et)
  (r2v0 o.Fy)
  (r3v0 o.Fw)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(o.Et, o.Fy, o.Fw, boolean):void (m)] (LINE:200) call: o.Fn.<init>(o.Et, o.Fy, o.Fw, boolean):void type: THIS */
    public /* synthetic */ C5121Fn(C5101Et c5101Et, InterfaceC5132Fy interfaceC5132Fy, C5130Fw c5130Fw, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c5101Et, interfaceC5132Fy, c5130Fw, (i & 8) != 0 ? false : z);
    }

    @Override // o.InterfaceC5097Ep
    public void KWHzl(@NotNull java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(str, new Function0<Unit>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlMapSerializer$entry$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InterfaceC5132Fy interfaceC5132Fy = this.this$0.OLrzqt;
                String str3 = str2;
                if (str3 == null) {
                    str3 = "";
                }
                interfaceC5132Fy.KWHzl(str3);
            }
        });
    }

    @Override // o.InterfaceC5097Ep
    public void copydefault(@NotNull java.lang.String str, final InterfaceC5103Ev interfaceC5103Ev) {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(str, new Function0<Unit>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlMapSerializer$entry$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (interfaceC5103Ev == null) {
                    this.OLrzqt.KWHzl("");
                    return;
                }
                C56455yG.copydefault(this.copydefault.KWHzl(), this.EZpvd);
                interfaceC5103Ev.EZpvd(this.copydefault);
                C56455yG.copydefault(this.copydefault.KWHzl());
            }
        });
    }

    @Override // o.InterfaceC5099Er
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(str);
    }

    @Override // o.InterfaceC5099Er
    public void EZpvd(@NotNull InterfaceC5103Ev interfaceC5103Ev) {
        Intrinsics.checkNotNullParameter(interfaceC5103Ev, "");
        interfaceC5103Ev.EZpvd(this.copydefault);
    }

    @Override // o.InterfaceC5097Ep
    public void KWHzl() {
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = this.EZpvd.AEQbTJ();
        if (!(setAEQbTJ instanceof java.util.Collection) || !setAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it = setAEQbTJ.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5096Eo) it.next()) instanceof C5111Fd) {
                    return;
                }
            }
        }
        if (this.KWHzl) {
            return;
        }
        InterfaceC5132Fy.Application.endTag$default(this.OLrzqt, C5119Fl.OLrzqt(this.EZpvd).AEQbTJ(), null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void OLrzqt(final java.lang.String str, final Function0<Unit> function0) {
        java.lang.Object next;
        java.lang.String strAEQbTJ;
        java.lang.Object next2;
        java.lang.Object next3;
        java.util.Iterator<T> it = this.EZpvd.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC5096Eo) next).getClass() == C5125Fr.class) {
                    break;
                }
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        if (!(interfaceC5096Eo instanceof C5125Fr)) {
            interfaceC5096Eo = null;
        }
        C5125Fr c5125FrKWHzl = (C5125Fr) interfaceC5096Eo;
        if (c5125FrKWHzl == null) {
            c5125FrKWHzl = C5125Fr.EZpvd.KWHzl();
        }
        final C5125Fr c5125Fr = c5125FrKWHzl;
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = this.EZpvd.AEQbTJ();
        if ((setAEQbTJ instanceof java.util.Collection) && setAEQbTJ.isEmpty()) {
            strAEQbTJ = c5125Fr.OLrzqt();
            if (strAEQbTJ == null) {
            }
        } else {
            java.util.Iterator<T> it2 = setAEQbTJ.iterator();
            while (it2.hasNext()) {
                if (((InterfaceC5096Eo) it2.next()) instanceof C5111Fd) {
                    strAEQbTJ = C5119Fl.OLrzqt(this.EZpvd).AEQbTJ();
                    break;
                }
            }
            strAEQbTJ = c5125Fr.OLrzqt();
            if (strAEQbTJ == null) {
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }
        }
        java.util.Iterator<T> it3 = this.EZpvd.AEQbTJ().iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it3.next();
                if (((InterfaceC5096Eo) next2).getClass() == C5123Fp.class) {
                    break;
                }
            }
        }
        InterfaceC5096Eo interfaceC5096Eo2 = (InterfaceC5096Eo) next2;
        if (!(interfaceC5096Eo2 instanceof C5123Fp)) {
            interfaceC5096Eo2 = null;
        }
        final C5123Fp c5123Fp = (C5123Fp) interfaceC5096Eo2;
        java.util.Iterator<T> it4 = this.EZpvd.AEQbTJ().iterator();
        while (true) {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            } else {
                next3 = it4.next();
                if (((InterfaceC5096Eo) next3).getClass() == C5114Fg.class) {
                    break;
                }
            }
        }
        InterfaceC5096Eo interfaceC5096Eo3 = (InterfaceC5096Eo) next3;
        final C5114Fg c5114Fg = (C5114Fg) (interfaceC5096Eo3 instanceof C5114Fg ? interfaceC5096Eo3 : null);
        C5129Fv.writeTag$default(this.OLrzqt, strAEQbTJ, null, new Function1<InterfaceC5132Fy, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlMapSerializer$writeEntry$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5132Fy interfaceC5132Fy) {
                invoke2(interfaceC5132Fy);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5132Fy interfaceC5132Fy) {
                Intrinsics.checkNotNullParameter(interfaceC5132Fy, "");
                String strEZpvd = c5125Fr.EZpvd();
                C5123Fp c5123Fp2 = c5123Fp;
                final String str2 = str;
                C5129Fv.EZpvd(interfaceC5132Fy, strEZpvd, c5123Fp2, new Function1<InterfaceC5132Fy, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlMapSerializer$writeEntry$1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5132Fy interfaceC5132Fy2) {
                        invoke2(interfaceC5132Fy2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5132Fy interfaceC5132Fy2) {
                        Intrinsics.checkNotNullParameter(interfaceC5132Fy2, "");
                        interfaceC5132Fy2.KWHzl(str2);
                    }
                });
                String strKWHzl = c5125Fr.KWHzl();
                C5114Fg c5114Fg2 = c5114Fg;
                final Function0<Unit> function02 = function0;
                C5129Fv.EZpvd(interfaceC5132Fy, strKWHzl, c5114Fg2, new Function1<InterfaceC5132Fy, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlMapSerializer$writeEntry$1.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5132Fy interfaceC5132Fy2) {
                        invoke2(interfaceC5132Fy2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull InterfaceC5132Fy interfaceC5132Fy2) {
                        Intrinsics.checkNotNullParameter(interfaceC5132Fy2, "");
                        function02.invoke();
                    }
                });
            }
        }, 2, null);
    }

    private final void copydefault(final java.lang.Object obj) {
        java.lang.Object next;
        java.lang.String strKWHzl;
        java.lang.Object next2;
        java.util.Iterator<T> it = this.EZpvd.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC5096Eo) next).getClass() == C5125Fr.class) {
                    break;
                }
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        if (!(interfaceC5096Eo instanceof C5125Fr)) {
            interfaceC5096Eo = null;
        }
        C5125Fr c5125Fr = (C5125Fr) interfaceC5096Eo;
        if (c5125Fr == null || (strKWHzl = c5125Fr.KWHzl()) == null) {
            strKWHzl = C5125Fr.EZpvd.KWHzl().KWHzl();
        }
        java.util.Iterator<T> it2 = this.EZpvd.AEQbTJ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (((InterfaceC5096Eo) next2).getClass() == C5114Fg.class) {
                    break;
                }
            }
        }
        InterfaceC5096Eo interfaceC5096Eo2 = (InterfaceC5096Eo) next2;
        C5129Fv.EZpvd(this.OLrzqt, strKWHzl, (C5114Fg) (interfaceC5096Eo2 instanceof C5114Fg ? interfaceC5096Eo2 : null), new Function1<InterfaceC5132Fy, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlMapSerializer$serializePrimitive$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5132Fy interfaceC5132Fy) {
                invoke2(interfaceC5132Fy);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5132Fy interfaceC5132Fy) {
                Intrinsics.checkNotNullParameter(interfaceC5132Fy, "");
                obj.toString();
            }
        });
    }
}
