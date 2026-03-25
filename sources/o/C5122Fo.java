package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5132Fy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Fo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5122Fo implements InterfaceC5094Em {
    public final C5101Et AEQbTJ;
    public final InterfaceC5132Fy EZpvd;
    public final C5130Fw KWHzl;

    public C5122Fo(@NotNull C5101Et c5101Et, @NotNull InterfaceC5132Fy interfaceC5132Fy, @NotNull C5130Fw c5130Fw) {
        Intrinsics.checkNotNullParameter(c5101Et, "");
        Intrinsics.checkNotNullParameter(interfaceC5132Fy, "");
        Intrinsics.checkNotNullParameter(c5130Fw, "");
        this.AEQbTJ = c5101Et;
        this.EZpvd = interfaceC5132Fy;
        this.KWHzl = c5130Fw;
    }

    @Override // o.InterfaceC5099Er
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ(str);
    }

    @Override // o.InterfaceC5099Er
    public void EZpvd(@NotNull final InterfaceC5103Ev interfaceC5103Ev) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(interfaceC5103Ev, "");
        C56455yG.copydefault(this.KWHzl.KWHzl(), this.AEQbTJ);
        java.util.Iterator<T> it = this.AEQbTJ.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC5096Eo) next).getClass() == C5114Fg.class) {
                    break;
                }
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        C5129Fv.EZpvd(this.EZpvd, KWHzl(), (C5114Fg) (interfaceC5096Eo instanceof C5114Fg ? interfaceC5096Eo : null), new Function1<InterfaceC5132Fy, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlListSerializer$serializeSdkSerializable$1
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
                interfaceC5103Ev.EZpvd(this.KWHzl);
            }
        });
        C56455yG.copydefault(this.KWHzl.KWHzl());
    }

    @Override // o.InterfaceC5094Em
    public void EZpvd() {
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = this.AEQbTJ.AEQbTJ();
        if (!(setAEQbTJ instanceof java.util.Collection) || !setAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it = setAEQbTJ.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5096Eo) it.next()) instanceof C5111Fd) {
                    return;
                }
            }
        }
        InterfaceC5132Fy.Application.endTag$default(this.EZpvd, C5119Fl.OLrzqt(this.AEQbTJ).AEQbTJ(), null, 2, null);
    }

    public final java.lang.String KWHzl() {
        java.lang.Object next;
        java.lang.String strCopydefault;
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = this.AEQbTJ.AEQbTJ();
        if (!(setAEQbTJ instanceof java.util.Collection) || !setAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it = setAEQbTJ.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5096Eo) it.next()) instanceof C5111Fd) {
                    return C5119Fl.OLrzqt(this.AEQbTJ).AEQbTJ();
                }
            }
        }
        java.util.Iterator<T> it2 = this.AEQbTJ.AEQbTJ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((InterfaceC5096Eo) next).getClass() == C5115Fh.class) {
                break;
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        C5115Fh c5115Fh = (C5115Fh) (interfaceC5096Eo instanceof C5115Fh ? interfaceC5096Eo : null);
        return (c5115Fh == null || (strCopydefault = c5115Fh.copydefault()) == null) ? C5115Fh.OLrzqt.OLrzqt().copydefault() : strCopydefault;
    }

    public final void AEQbTJ(final java.lang.Object obj) {
        java.lang.Object next;
        java.util.Iterator<T> it = this.AEQbTJ.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC5096Eo) next).getClass() == C5114Fg.class) {
                    break;
                }
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        C5129Fv.EZpvd(this.EZpvd, KWHzl(), (C5114Fg) (interfaceC5096Eo instanceof C5114Fg ? interfaceC5096Eo : null), new Function1<InterfaceC5132Fy, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.xml.XmlListSerializer$serializePrimitive$1
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
                interfaceC5132Fy.KWHzl(obj.toString());
            }
        });
    }
}
