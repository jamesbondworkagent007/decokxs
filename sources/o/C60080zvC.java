package o;

import org.slf4j.Marker;
import org.slf4j.event.Level;

/* JADX INFO: renamed from: o.zvC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60080zvC implements InterfaceC60078zvA {
    public static java.lang.String EZpvd = "org.slf4j.spi.DefaultLoggingEventBuilder";
    public InterfaceC60100zvh AEQbTJ;
    public C60102zvj copydefault;

    public C60080zvC(InterfaceC60100zvh interfaceC60100zvh, Level level) {
        this.AEQbTJ = interfaceC60100zvh;
        this.copydefault = new C60102zvj(level, interfaceC60100zvh);
    }

    @Override // o.InterfaceC60078zvA
    public InterfaceC60078zvA EZpvd(java.lang.Throwable th) {
        this.copydefault.KWHzl(th);
        return this;
    }

    public void copydefault(java.lang.String str) {
        this.copydefault.EZpvd(str);
    }

    @Override // o.InterfaceC60078zvA
    public void EZpvd() {
        EZpvd(this.copydefault);
    }

    @Override // o.InterfaceC60078zvA
    public InterfaceC60078zvA AEQbTJ(java.util.function.Supplier<java.lang.String> supplier) {
        this.copydefault.KWHzl(supplier.get());
        return this;
    }

    public void EZpvd(InterfaceC60105zvm interfaceC60105zvm) {
        copydefault(EZpvd);
        InterfaceC60100zvh interfaceC60100zvh = this.AEQbTJ;
        if (interfaceC60100zvh instanceof InterfaceC60082zvE) {
            ((InterfaceC60082zvE) interfaceC60100zvh).copydefault(interfaceC60105zvm);
        } else {
            AEQbTJ(interfaceC60105zvm);
        }
    }

    public final void AEQbTJ(InterfaceC60105zvm interfaceC60105zvm) {
        java.lang.Object[] objArrOLrzqt = interfaceC60105zvm.OLrzqt();
        int length = objArrOLrzqt == null ? 0 : objArrOLrzqt.length;
        java.lang.Throwable thGEmmrt = interfaceC60105zvm.gEmmrt();
        int i = thGEmmrt == null ? 0 : 1;
        java.lang.String strAEQbTJ = interfaceC60105zvm.AEQbTJ();
        java.lang.Object[] objArr = new java.lang.Object[i + length];
        if (objArrOLrzqt != null) {
            java.lang.System.arraycopy(objArrOLrzqt, 0, objArr, 0, length);
        }
        if (thGEmmrt != null) {
            objArr[length] = thGEmmrt;
        }
        java.lang.String strAEQbTJ2 = AEQbTJ(interfaceC60105zvm, strAEQbTJ);
        int i2 = AnonymousClass3.EZpvd[interfaceC60105zvm.EZpvd().ordinal()];
        if (i2 == 1) {
            this.AEQbTJ.trace(strAEQbTJ2, objArr);
            return;
        }
        if (i2 == 2) {
            this.AEQbTJ.debug(strAEQbTJ2, objArr);
            return;
        }
        if (i2 == 3) {
            this.AEQbTJ.info(strAEQbTJ2, objArr);
        } else if (i2 == 4) {
            this.AEQbTJ.warn(strAEQbTJ2, objArr);
        } else {
            if (i2 != 5) {
                return;
            }
            this.AEQbTJ.error(strAEQbTJ2, objArr);
        }
    }

    /* JADX INFO: renamed from: o.zvC$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[Level.values().length];
            EZpvd = iArr;
            try {
                iArr[Level.TRACE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                EZpvd[Level.DEBUG.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                EZpvd[Level.INFO.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                EZpvd[Level.WARN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                EZpvd[Level.ERROR.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public final java.lang.String AEQbTJ(InterfaceC60105zvm interfaceC60105zvm, java.lang.String str) {
        java.lang.StringBuilder sb;
        if (interfaceC60105zvm.copydefault() != null) {
            sb = new java.lang.StringBuilder();
            java.util.Iterator<Marker> it = interfaceC60105zvm.copydefault().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(' ');
            }
        } else {
            sb = null;
        }
        if (interfaceC60105zvm.KWHzl() != null) {
            if (sb == null) {
                sb = new java.lang.StringBuilder();
            }
            for (C60104zvl c60104zvl : interfaceC60105zvm.KWHzl()) {
                sb.append(c60104zvl.KWHzl);
                sb.append('=');
                sb.append(c60104zvl.copydefault);
                sb.append(' ');
            }
        }
        if (sb == null) {
            return str;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // o.InterfaceC60078zvA
    public InterfaceC60078zvA AEQbTJ(java.lang.String str, java.lang.Object obj) {
        this.copydefault.EZpvd(str, obj);
        return this;
    }
}
