package o;

import aws.smithy.kotlin.runtime.serde.SerializationException;
import aws.smithy.kotlin.runtime.time.TimestampFormat;
import com.huawei.hms.framework.common.ContainerUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.CO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EH implements InterfaceC5097Ep {
    public final ED AEQbTJ;
    public int EZpvd;
    public final EI KWHzl;
    public final CQ OLrzqt;
    public final C5101Et copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(byte b) {
        this.KWHzl.copydefault(b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(char c) {
        this.KWHzl.copydefault(c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(double d) {
        this.KWHzl.OLrzqt(d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5099Er
    public void EZpvd(@NotNull InterfaceC5103Ev interfaceC5103Ev) {
        Intrinsics.checkNotNullParameter(interfaceC5103Ev, "");
        this.KWHzl.EZpvd(interfaceC5103Ev);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(short s) {
        this.KWHzl.AEQbTJ(s);
    }

    @Override // o.InterfaceC5097Ep
    public void KWHzl() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i) {
        this.KWHzl.OLrzqt(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5099Er
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.KWHzl.AEQbTJ(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(float f) {
        this.KWHzl.copydefault(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(long j) {
        this.KWHzl.OLrzqt(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@NotNull C5173Hn c5173Hn, @NotNull TimestampFormat timestampFormat) {
        Intrinsics.checkNotNullParameter(c5173Hn, "");
        Intrinsics.checkNotNullParameter(timestampFormat, "");
        this.KWHzl.OLrzqt(c5173Hn, timestampFormat);
    }

    public EH(@NotNull EI ei, @NotNull C5101Et c5101Et) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(ei, "");
        Intrinsics.checkNotNullParameter(c5101Et, "");
        this.KWHzl = ei;
        this.copydefault = c5101Et;
        this.OLrzqt = ei.OLrzqt();
        java.util.Iterator<T> it = c5101Et.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((InterfaceC5096Eo) next).getClass() == ED.class) {
                    break;
                }
            }
        }
        InterfaceC5096Eo interfaceC5096Eo = (InterfaceC5096Eo) next;
        ED ed = (ED) (interfaceC5096Eo instanceof ED ? interfaceC5096Eo : null);
        this.AEQbTJ = ed == null ? ED.KWHzl.OLrzqt() : ed;
    }

    public final void EZpvd(java.lang.String str) throws java.io.IOException {
        this.EZpvd++;
        if (this.OLrzqt.AhwBna() > 0) {
            CO.Application.writeUtf8$default(this.OLrzqt, ContainerUtils.FIELD_DELIMITER, 0, 0, 6, null);
        }
        CO.Application.writeUtf8$default(this.OLrzqt, AEQbTJ() + '.' + this.AEQbTJ.copydefault() + '=' + EE.AEQbTJ(str), 0, 0, 6, null);
    }

    public final void AEQbTJ(java.lang.String str, Function0<Unit> function0) throws java.io.IOException {
        EZpvd(str);
        CO.Application.writeUtf8$default(this.OLrzqt, ContainerUtils.FIELD_DELIMITER, 0, 0, 6, null);
        CO.Application.writeUtf8$default(this.OLrzqt, AEQbTJ() + '.' + this.AEQbTJ.EZpvd() + '=', 0, 0, 6, null);
        function0.invoke();
    }

    @Override // o.InterfaceC5097Ep
    public void KWHzl(@NotNull java.lang.String str, final java.lang.String str2) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ(str, new Function0<Unit>() { // from class: aws.smithy.kotlin.runtime.serde.formurl.FormUrlMapSerializer$entry$9
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
                String str3 = str2;
                if (str3 != null) {
                    this.KWHzl(str3);
                    return;
                }
                throw new SerializationException("sparse collections are not supported by form-url encoding");
            }
        });
    }

    @Override // o.InterfaceC5097Ep
    public void copydefault(@NotNull java.lang.String str, InterfaceC5103Ev interfaceC5103Ev) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(str, "");
        if (interfaceC5103Ev != null) {
            EZpvd(str);
            interfaceC5103Ev.EZpvd(new EI(this.OLrzqt, AEQbTJ() + '.' + this.AEQbTJ.EZpvd() + '.'));
            return;
        }
        throw new SerializationException("sparse collections are not supported by form-url encoding");
    }

    public final java.lang.String AEQbTJ() {
        java.util.Set<InterfaceC5096Eo> setAEQbTJ = this.copydefault.AEQbTJ();
        if (!(setAEQbTJ instanceof java.util.Collection) || !setAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it = setAEQbTJ.iterator();
            while (it.hasNext()) {
                if (((InterfaceC5096Eo) it.next()) instanceof EA) {
                    return EE.OLrzqt(this.copydefault) + '.' + this.EZpvd;
                }
            }
        }
        return EE.OLrzqt(this.copydefault) + ".entry." + this.EZpvd;
    }
}
