package o;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.CO;
import o.CQ;
import o.EE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EC implements InterfaceC5094Em {
    public final C5101Et AEQbTJ;
    public final CQ EZpvd;
    public int KWHzl;
    public final long copydefault;

    public EC(@NotNull EI ei, @NotNull C5101Et c5101Et) {
        Intrinsics.checkNotNullParameter(ei, "");
        Intrinsics.checkNotNullParameter(c5101Et, "");
        this.AEQbTJ = c5101Et;
        CQ cqOLrzqt = ei.OLrzqt();
        this.EZpvd = cqOLrzqt;
        this.copydefault = cqOLrzqt.AhwBna();
    }

    public final void OLrzqt(Function1<? super CQ, Unit> function1) throws java.io.IOException {
        this.KWHzl++;
        if (this.EZpvd.AhwBna() > 0) {
            CO.Application.writeUtf8$default(this.EZpvd, ContainerUtils.FIELD_DELIMITER, 0, 0, 6, null);
        }
        CO.Application.writeUtf8$default(this.EZpvd, copydefault(), 0, 0, 6, null);
        CO.Application.writeUtf8$default(this.EZpvd, ContainerUtils.KEY_VALUE_DELIMITER, 0, 0, 6, null);
        function1.invoke(this.EZpvd);
    }

    @Override // o.InterfaceC5094Em
    public void EZpvd() throws java.io.IOException {
        if (this.EZpvd.AhwBna() == this.copydefault) {
            if (this.EZpvd.AhwBna() > 0) {
                CO.Application.writeUtf8$default(this.EZpvd, ContainerUtils.FIELD_DELIMITER, 0, 0, 6, null);
            }
            CO.Application.writeUtf8$default(this.EZpvd, EE.OLrzqt(this.AEQbTJ), 0, 0, 6, null);
            CO.Application.writeUtf8$default(this.EZpvd, ContainerUtils.KEY_VALUE_DELIMITER, 0, 0, 6, null);
        }
    }

    @Override // o.InterfaceC5099Er
    public void KWHzl(@NotNull final java.lang.String str) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(new Function1<CQ, Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlListSerializer$serializeString$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CQ cq) throws IOException {
                invoke2(cq);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull CQ cq) throws IOException {
                Intrinsics.checkNotNullParameter(cq, "");
                CO.Application.writeUtf8$default(cq, EE.AEQbTJ(str), 0, 0, 6, null);
            }
        });
    }

    @Override // o.InterfaceC5099Er
    public void EZpvd(@NotNull InterfaceC5103Ev interfaceC5103Ev) {
        Intrinsics.checkNotNullParameter(interfaceC5103Ev, "");
        this.KWHzl++;
        interfaceC5103Ev.EZpvd(new EI(this.EZpvd, copydefault() + '.'));
    }

    public final java.lang.String copydefault() {
        java.lang.Object next;
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = this.AEQbTJ.AEQbTJ();
        if (!(setAEQbTJ instanceof java.util.Collection) || !setAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it = setAEQbTJ.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5096Eo) it.next()) instanceof EA) {
                    return EE.OLrzqt(this.AEQbTJ) + '.' + this.KWHzl;
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
            if (((InterfaceC5096Eo) next).getClass() == C5107Ez.class) {
                break;
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        C5107Ez c5107EzKWHzl = (C5107Ez) (interfaceC5096Eo instanceof C5107Ez ? interfaceC5096Eo : null);
        if (c5107EzKWHzl == null) {
            c5107EzKWHzl = C5107Ez.EZpvd.KWHzl();
        }
        return EE.OLrzqt(this.AEQbTJ) + '.' + c5107EzKWHzl.KWHzl() + '.' + this.KWHzl;
    }
}
