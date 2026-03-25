package o;

import aws.smithy.kotlin.runtime.serde.xml.XmlSerializer$field$1;
import aws.smithy.kotlin.runtime.serde.xml.XmlSerializer$field$3;
import aws.smithy.kotlin.runtime.serde.xml.XmlSerializer$numberField$1;
import aws.smithy.kotlin.runtime.time.TimestampFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5132Fy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Fw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5130Fw implements InterfaceC5106Ey, EB {
    public final InterfaceC5132Fy KWHzl;
    public java.util.List<C5101Et> OLrzqt;
    public java.util.List<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5130Fw() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C5101Et> KWHzl() {
        return this.OLrzqt;
    }

    public void OLrzqt() {
    }

    public C5130Fw(@NotNull InterfaceC5132Fy interfaceC5132Fy) {
        Intrinsics.checkNotNullParameter(interfaceC5132Fy, "");
        this.KWHzl = interfaceC5132Fy;
        this.copydefault = new java.util.ArrayList();
        this.OLrzqt = new java.util.ArrayList();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:o.Fy:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.Fy:0x0006: INVOKE false, (1 int), (null java.lang.Object) STATIC call: o.Fz.xmlStreamWriter$default(boolean, int, java.lang.Object):o.Fy A[MD:(boolean, int, java.lang.Object):o.Fy (m), WRAPPED] (LINE:21)) : (r1v0 o.Fy))
 A[MD:(o.Fy):void (m)] (LINE:21) call: o.Fw.<init>(o.Fy):void type: THIS */
    public /* synthetic */ C5130Fw(InterfaceC5132Fy interfaceC5132Fy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C5133Fz.xmlStreamWriter$default(false, 1, null) : interfaceC5132Fy);
    }

    @Override // o.InterfaceC5106Ey
    public byte[] copydefault() {
        return this.KWHzl.KWHzl();
    }

    @Override // o.InterfaceC5106Ey
    public EB EZpvd(@NotNull C5101Et c5101Et) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(c5101Et, "");
        C5101Et c5101Et2 = (C5101Et) C56455yG.OLrzqt(this.OLrzqt);
        if (c5101Et2 != null) {
            c5101Et = c5101Et2;
        }
        boolean zIsEmpty = this.copydefault.isEmpty();
        java.util.Iterator<T> it = c5101Et.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((InterfaceC5096Eo) next).getClass() == C5127Ft.class) {
                break;
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        if (!(interfaceC5096Eo instanceof C5127Ft)) {
            interfaceC5096Eo = null;
        }
        C5127Ft c5127Ft = (C5127Ft) interfaceC5096Eo;
        if (c5127Ft != null && (zIsEmpty || c5127Ft.OLrzqt() != null)) {
            this.KWHzl.AEQbTJ(c5127Ft.copydefault(), c5127Ft.OLrzqt());
        }
        java.lang.String strAEQbTJ = C5119Fl.OLrzqt(c5101Et).AEQbTJ();
        if (!C5129Fv.OLrzqt(c5101Et)) {
            InterfaceC5132Fy.Application.startTag$default(this.KWHzl, strAEQbTJ, null, 2, null);
        }
        C56455yG.copydefault(this.copydefault, strAEQbTJ);
        return this;
    }

    @Override // o.EB
    public void AEQbTJ() {
        if (!(!this.copydefault.isEmpty())) {
            throw new java.lang.IllegalStateException("Expected nodeStack to have a value, but was empty.".toString());
        }
        java.lang.String str = (java.lang.String) C56455yG.copydefault(this.copydefault);
        if (!(!this.OLrzqt.isEmpty()) || C5129Fv.OLrzqt((C5101Et) C56455yG.EZpvd(this.OLrzqt))) {
            return;
        }
        InterfaceC5132Fy.Application.endTag$default(this.KWHzl, str, null, 2, null);
    }

    @Override // o.EB
    public void EZpvd(@NotNull C5101Et c5101Et, @NotNull InterfaceC5103Ev interfaceC5103Ev) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(interfaceC5103Ev, "");
        C56455yG.copydefault(this.OLrzqt, c5101Et);
        interfaceC5103Ev.EZpvd(this);
        C56455yG.copydefault(this.OLrzqt);
    }

    public final void KWHzl(C5101Et c5101Et, java.lang.Number number) {
        EZpvd(c5101Et, number, new XmlSerializer$numberField$1(this));
    }

    @Override // o.EB
    public void OLrzqt(@NotNull C5101Et c5101Et, boolean z) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        EZpvd(c5101Et, java.lang.Boolean.valueOf(z), new XmlSerializer$field$1(this));
    }

    @Override // o.EB
    public void OLrzqt(@NotNull C5101Et c5101Et, int i) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        KWHzl(c5101Et, java.lang.Integer.valueOf(i));
    }

    @Override // o.EB
    public void EZpvd(@NotNull C5101Et c5101Et, long j) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        KWHzl(c5101Et, java.lang.Long.valueOf(j));
    }

    @Override // o.EB
    public void copydefault(@NotNull C5101Et c5101Et, float f) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        KWHzl(c5101Et, java.lang.Float.valueOf(f));
    }

    @Override // o.EB
    public void AEQbTJ(@NotNull C5101Et c5101Et, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(c5101Et, str, new XmlSerializer$field$3(this));
    }

    @Override // o.EB
    public void KWHzl(@NotNull C5101Et c5101Et, @NotNull C5173Hn c5173Hn, @NotNull TimestampFormat timestampFormat) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        Intrinsics.checkNotNullParameter(timestampFormat, "");
        AEQbTJ(c5101Et, c5173Hn.OLrzqt(timestampFormat));
    }

    public void AEQbTJ(boolean z) {
        this.KWHzl.KWHzl(java.lang.String.valueOf(z));
    }

    public void EZpvd(char c) {
        this.KWHzl.KWHzl(java.lang.String.valueOf(c));
    }

    public final void EZpvd(java.lang.Number number) {
        C5133Fz.AEQbTJ(this.KWHzl, number);
    }

    @Override // o.InterfaceC5099Er
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.KWHzl(str);
    }

    @Override // o.InterfaceC5099Er
    public void EZpvd(@NotNull InterfaceC5103Ev interfaceC5103Ev) {
        Intrinsics.checkNotNullParameter(interfaceC5103Ev, "");
        interfaceC5103Ev.EZpvd(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f A[SYNTHETIC] */
    @Override // o.InterfaceC5106Ey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC5094Em AEQbTJ(@NotNull C5101Et c5101Et) {
        java.util.Iterator<T> it;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(c5101Et, "");
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = c5101Et.AEQbTJ();
        if (!(setAEQbTJ instanceof java.util.Collection) || !setAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it2 = setAEQbTJ.iterator();
            while (it2.hasNext()) {
                if (((InterfaceC5096Eo) it2.next()) instanceof C5111Fd) {
                    break;
                }
            }
            it = c5101Et.AEQbTJ().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((InterfaceC5096Eo) next).getClass() == C5127Ft.class) {
                    break;
                }
            }
            InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
            C5129Fv.EZpvd(this.KWHzl, C5119Fl.OLrzqt(c5101Et).AEQbTJ(), (C5127Ft) (interfaceC5096Eo instanceof C5127Ft ? interfaceC5096Eo : null));
        } else {
            it = c5101Et.AEQbTJ().iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            InterfaceC5096Eo interfaceC5096Eo2 = (InterfaceC5096Eo) next;
            if (interfaceC5096Eo2 instanceof C5127Ft) {
            }
            C5129Fv.EZpvd(this.KWHzl, C5119Fl.OLrzqt(c5101Et).AEQbTJ(), (C5127Ft) (interfaceC5096Eo2 instanceof C5127Ft ? interfaceC5096Eo2 : null));
        }
        return new C5122Fo(c5101Et, this.KWHzl, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f A[SYNTHETIC] */
    @Override // o.InterfaceC5106Ey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC5097Ep KWHzl(@NotNull C5101Et c5101Et) {
        java.util.Iterator<T> it;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(c5101Et, "");
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = c5101Et.AEQbTJ();
        if (!(setAEQbTJ instanceof java.util.Collection) || !setAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it2 = setAEQbTJ.iterator();
            while (it2.hasNext()) {
                if (((InterfaceC5096Eo) it2.next()) instanceof C5111Fd) {
                    break;
                }
            }
            it = c5101Et.AEQbTJ().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((InterfaceC5096Eo) next).getClass() == C5127Ft.class) {
                    break;
                }
            }
            InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
            C5129Fv.EZpvd(this.KWHzl, C5119Fl.OLrzqt(c5101Et).AEQbTJ(), (C5127Ft) (interfaceC5096Eo instanceof C5127Ft ? interfaceC5096Eo : null));
        } else {
            it = c5101Et.AEQbTJ().iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            InterfaceC5096Eo interfaceC5096Eo2 = (InterfaceC5096Eo) next;
            if (interfaceC5096Eo2 instanceof C5127Ft) {
            }
            C5129Fv.EZpvd(this.KWHzl, C5119Fl.OLrzqt(c5101Et).AEQbTJ(), (C5127Ft) (interfaceC5096Eo2 instanceof C5127Ft ? interfaceC5096Eo2 : null));
        }
        return new C5121Fn(c5101Et, this.KWHzl, this, false, 8, null);
    }

    public final <T> void EZpvd(C5101Et c5101Et, final T t, final Function1<? super T, Unit> function1) {
        T next;
        java.util.Iterator<T> it = c5101Et.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC5096Eo) next).getClass() == C5127Ft.class) {
                    break;
                }
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        if (!(interfaceC5096Eo instanceof C5127Ft)) {
            interfaceC5096Eo = null;
        }
        C5127Ft c5127Ft = (C5127Ft) interfaceC5096Eo;
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = c5101Et.AEQbTJ();
        if (!(setAEQbTJ instanceof java.util.Collection) || !setAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it2 = setAEQbTJ.iterator();
            while (it2.hasNext()) {
                if (((InterfaceC5096Eo) it2.next()) instanceof C5112Fe) {
                    this.KWHzl.copydefault(C5119Fl.OLrzqt(c5101Et).AEQbTJ(), t.toString(), c5127Ft != null ? c5127Ft.copydefault() : null);
                    return;
                }
            }
        }
        C5129Fv.EZpvd(this.KWHzl, C5119Fl.OLrzqt(c5101Et).AEQbTJ(), c5127Ft, new Function1<InterfaceC5132Fy, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlSerializer$tagOrAttribute$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InterfaceC5132Fy interfaceC5132Fy) {
                Intrinsics.checkNotNullParameter(interfaceC5132Fy, "");
                function1.invoke(t);
            }
        });
    }

    @Override // o.EB
    public void EZpvd(@NotNull C5101Et c5101Et, @NotNull Function1<? super InterfaceC5094Em, Unit> function1) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC5094Em interfaceC5094EmAEQbTJ = AEQbTJ(c5101Et);
        function1.invoke(interfaceC5094EmAEQbTJ);
        interfaceC5094EmAEQbTJ.EZpvd();
    }

    @Override // o.EB
    public void OLrzqt(@NotNull C5101Et c5101Et, @NotNull Function1<? super InterfaceC5097Ep, Unit> function1) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(function1, "");
        InterfaceC5097Ep interfaceC5097EpKWHzl = KWHzl(c5101Et);
        function1.invoke(interfaceC5097EpKWHzl);
        interfaceC5097EpKWHzl.KWHzl();
    }
}
