package o;

import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.SingleRequest;
import java.util.Objects;

/* JADX INFO: renamed from: o.Nt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5335Nt<TranscodeType> extends RX<C5335Nt<TranscodeType>> implements java.lang.Cloneable {
    public static final C5448Sc EZpvd = new C5448Sc().copydefault(AbstractC5360Os.EZpvd).OLrzqt(Priority.LOW).copydefault(true);
    public final Glide AEQbTJ;
    public boolean AYXKKw = true;
    public boolean AhwBna;
    public final java.lang.Class<TranscodeType> AkhnZx;
    public java.lang.Float DbNXlk;
    public final android.content.Context KWHzl;
    public C5335Nt<TranscodeType> OLrzqt;
    public final C5330No copydefault;
    public java.util.List<RY<TranscodeType>> djBIcL;
    public AbstractC5334Ns<?, ? super TranscodeType> fetchVPNInfo;
    public boolean gEmmrt;
    public final ComponentCallbacks2C5333Nr isConnected;
    public java.lang.Object valueOf;
    public C5335Nt<TranscodeType> values;

    @Override // o.RX
    public /* synthetic */ RX KWHzl(@androidx.annotation.NonNull RX rx) {
        return OLrzqt((RX<?>) rx);
    }

    public C5335Nt(@androidx.annotation.NonNull Glide glide, ComponentCallbacks2C5333Nr componentCallbacks2C5333Nr, java.lang.Class<TranscodeType> cls, android.content.Context context) {
        this.AEQbTJ = glide;
        this.isConnected = componentCallbacks2C5333Nr;
        this.AkhnZx = cls;
        this.KWHzl = context;
        this.fetchVPNInfo = componentCallbacks2C5333Nr.copydefault(cls);
        this.copydefault = glide.valueOf();
        AEQbTJ(componentCallbacks2C5333Nr.OLrzqt());
        OLrzqt((RX<?>) componentCallbacks2C5333Nr.gEmmrt());
    }

    public final void AEQbTJ(java.util.List<RY<java.lang.Object>> list) {
        java.util.Iterator<RY<java.lang.Object>> it = list.iterator();
        while (it.hasNext()) {
            copydefault((RY) it.next());
        }
    }

    public C5335Nt<TranscodeType> OLrzqt(@androidx.annotation.NonNull RX<?> rx) {
        SE.OLrzqt(rx);
        return (C5335Nt) super.KWHzl(rx);
    }

    public C5335Nt<TranscodeType> OLrzqt(@androidx.annotation.Nullable RY<TranscodeType> ry) {
        if (sSMYrx()) {
            return copydefault().OLrzqt((RY) ry);
        }
        this.djBIcL = null;
        return copydefault((RY) ry);
    }

    public C5335Nt<TranscodeType> copydefault(@androidx.annotation.Nullable RY<TranscodeType> ry) {
        if (sSMYrx()) {
            return copydefault().copydefault((RY) ry);
        }
        if (ry != null) {
            if (this.djBIcL == null) {
                this.djBIcL = new java.util.ArrayList();
            }
            this.djBIcL.add(ry);
        }
        return dNCPSb();
    }

    public C5335Nt<TranscodeType> AEQbTJ(@androidx.annotation.Nullable C5335Nt<TranscodeType> c5335Nt) {
        if (sSMYrx()) {
            return copydefault().AEQbTJ(c5335Nt);
        }
        this.OLrzqt = c5335Nt;
        return dNCPSb();
    }

    public C5335Nt<TranscodeType> EZpvd(java.lang.Object obj) {
        if (obj == null) {
            return AEQbTJ((C5335Nt) null);
        }
        return AEQbTJ(KWHzl().copydefault(obj));
    }

    public final C5335Nt<TranscodeType> KWHzl() {
        return copydefault().AEQbTJ((C5335Nt) null).EZpvd((C5335Nt) null);
    }

    public C5335Nt<TranscodeType> EZpvd(@androidx.annotation.Nullable C5335Nt<TranscodeType> c5335Nt) {
        if (sSMYrx()) {
            return copydefault().EZpvd((C5335Nt) c5335Nt);
        }
        this.values = c5335Nt;
        return dNCPSb();
    }

    public C5335Nt<TranscodeType> copydefault(@androidx.annotation.Nullable java.lang.Object obj) {
        return OLrzqt(obj);
    }

    public final C5335Nt<TranscodeType> OLrzqt(@androidx.annotation.Nullable java.lang.Object obj) {
        if (sSMYrx()) {
            return copydefault().OLrzqt(obj);
        }
        this.valueOf = obj;
        this.gEmmrt = true;
        return dNCPSb();
    }

    public C5335Nt<TranscodeType> AEQbTJ(@androidx.annotation.Nullable android.graphics.Bitmap bitmap) {
        return OLrzqt(bitmap).OLrzqt((RX<?>) C5448Sc.OLrzqt(AbstractC5360Os.KWHzl));
    }

    public C5335Nt<TranscodeType> copydefault(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        return OLrzqt((java.lang.Object) drawable).OLrzqt((RX<?>) C5448Sc.OLrzqt(AbstractC5360Os.KWHzl));
    }

    public C5335Nt<TranscodeType> copydefault(@androidx.annotation.Nullable java.lang.String str) {
        return OLrzqt(str);
    }

    public C5335Nt<TranscodeType> EZpvd(@androidx.annotation.Nullable android.net.Uri uri) {
        return KWHzl(uri, OLrzqt(uri));
    }

    public final C5335Nt<TranscodeType> KWHzl(@androidx.annotation.Nullable android.net.Uri uri, C5335Nt<TranscodeType> c5335Nt) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? c5335Nt : copydefault((C5335Nt) c5335Nt);
    }

    public final C5335Nt<TranscodeType> copydefault(C5335Nt<TranscodeType> c5335Nt) {
        return c5335Nt.EZpvd(this.KWHzl.getTheme()).AEQbTJ(C5468Sw.EZpvd(this.KWHzl));
    }

    public C5335Nt<TranscodeType> AEQbTJ(@androidx.annotation.Nullable java.io.File file) {
        return OLrzqt(file);
    }

    public C5335Nt<TranscodeType> EZpvd(@androidx.annotation.Nullable @androidx.annotation.DrawableRes @androidx.annotation.RawRes java.lang.Integer num) {
        return copydefault((C5335Nt) OLrzqt(num));
    }

    public C5335Nt<TranscodeType> EZpvd(@androidx.annotation.Nullable byte[] bArr) {
        C5335Nt<TranscodeType> c5335NtOLrzqt = OLrzqt(bArr);
        if (!c5335NtOLrzqt.AwvSrB()) {
            c5335NtOLrzqt = c5335NtOLrzqt.OLrzqt((RX<?>) C5448Sc.OLrzqt(AbstractC5360Os.KWHzl));
        }
        return !c5335NtOLrzqt.QOLQEE() ? c5335NtOLrzqt.OLrzqt((RX<?>) C5448Sc.OLrzqt(true)) : c5335NtOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/RX; */
    @Override // o.RX
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C5335Nt<TranscodeType> copydefault() {
        C5335Nt<TranscodeType> c5335Nt = (C5335Nt) super.copydefault();
        c5335Nt.fetchVPNInfo = c5335Nt.fetchVPNInfo.clone();
        if (c5335Nt.djBIcL != null) {
            c5335Nt.djBIcL = new java.util.ArrayList(c5335Nt.djBIcL);
        }
        C5335Nt<TranscodeType> c5335Nt2 = c5335Nt.values;
        if (c5335Nt2 != null) {
            c5335Nt.values = c5335Nt2.copydefault();
        }
        C5335Nt<TranscodeType> c5335Nt3 = c5335Nt.OLrzqt;
        if (c5335Nt3 != null) {
            c5335Nt.OLrzqt = c5335Nt3.copydefault();
        }
        return c5335Nt;
    }

    public <Y extends InterfaceC5462Sq<TranscodeType>> Y OLrzqt(@androidx.annotation.NonNull Y y) {
        return (Y) copydefault(y, null, C5469Sx.AEQbTJ());
    }

    public <Y extends InterfaceC5462Sq<TranscodeType>> Y copydefault(@androidx.annotation.NonNull Y y, @androidx.annotation.Nullable RY<TranscodeType> ry, java.util.concurrent.Executor executor) {
        return (Y) EZpvd(y, ry, this, executor);
    }

    public final <Y extends InterfaceC5462Sq<TranscodeType>> Y EZpvd(@androidx.annotation.NonNull Y y, @androidx.annotation.Nullable RY<TranscodeType> ry, RX<?> rx, java.util.concurrent.Executor executor) {
        SE.OLrzqt(y);
        if (!this.gEmmrt) {
            throw new java.lang.IllegalArgumentException("You must call #load() before calling #into()");
        }
        RV rvAEQbTJ = AEQbTJ(y, ry, rx, executor);
        RV rvOLrzqt = y.OLrzqt();
        if (rvAEQbTJ.EZpvd(rvOLrzqt) && !copydefault(rx, rvOLrzqt)) {
            if (!((RV) SE.OLrzqt(rvOLrzqt)).gEmmrt()) {
                rvOLrzqt.OLrzqt();
            }
            return y;
        }
        this.isConnected.EZpvd((InterfaceC5462Sq<?>) y);
        y.AEQbTJ(rvAEQbTJ);
        this.isConnected.KWHzl(y, rvAEQbTJ);
        return y;
    }

    public final boolean copydefault(RX<?> rx, RV rv) {
        return !rx.gHZMYf() && rv.valueOf();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:? */
    public AbstractC5461Sp<android.widget.ImageView, TranscodeType> EZpvd(@androidx.annotation.NonNull android.widget.ImageView imageView) {
        RX rxQfsBiF;
        SI.copydefault();
        SE.OLrzqt(imageView);
        if (!ORxRYg() && OcIXYQ() && imageView.getScaleType() != null) {
            switch (AnonymousClass4.copydefault[imageView.getScaleType().ordinal()]) {
                case 1:
                    rxQfsBiF = copydefault().QfsBiF();
                    break;
                case 2:
                    rxQfsBiF = copydefault().QbewEr();
                    break;
                case 3:
                case 4:
                case 5:
                    rxQfsBiF = copydefault().QUSxYX();
                    break;
                case 6:
                    rxQfsBiF = copydefault().QbewEr();
                    break;
                default:
                    rxQfsBiF = this;
                    break;
            }
        } else {
            rxQfsBiF = this;
        }
        return (AbstractC5461Sp) EZpvd(this.copydefault.OLrzqt(imageView, this.AkhnZx), null, rxQfsBiF, C5469Sx.AEQbTJ());
    }

    public RW<TranscodeType> AEQbTJ() {
        return AEQbTJ(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public RW<TranscodeType> AEQbTJ(int i, int i2) {
        RZ rz = new RZ(i, i2);
        return (RW) copydefault(rz, rz, C5469Sx.OLrzqt());
    }

    public InterfaceC5462Sq<TranscodeType> KWHzl(int i, int i2) {
        return OLrzqt(C5456Sk.OLrzqt(this.isConnected, i, i2));
    }

    public InterfaceC5462Sq<TranscodeType> EZpvd() {
        return KWHzl(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: o.Nt$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[Priority.values().length];
            KWHzl = iArr;
            try {
                iArr[Priority.LOW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                KWHzl[Priority.NORMAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                KWHzl[Priority.HIGH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                KWHzl[Priority.IMMEDIATE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            copydefault = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                copydefault[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                copydefault[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                copydefault[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                copydefault[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                copydefault[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                copydefault[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                copydefault[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    public final Priority EZpvd(@androidx.annotation.NonNull Priority priority) {
        int i = AnonymousClass4.KWHzl[priority.ordinal()];
        if (i == 1) {
            return Priority.NORMAL;
        }
        if (i == 2) {
            return Priority.HIGH;
        }
        if (i == 3 || i == 4) {
            return Priority.IMMEDIATE;
        }
        throw new java.lang.IllegalArgumentException("unknown priority: " + getNewProxyInstance());
    }

    public final RV AEQbTJ(InterfaceC5462Sq<TranscodeType> interfaceC5462Sq, @androidx.annotation.Nullable RY<TranscodeType> ry, RX<?> rx, java.util.concurrent.Executor executor) {
        return copydefault(new java.lang.Object(), interfaceC5462Sq, ry, null, this.fetchVPNInfo, rx.getNewProxyInstance(), rx.hDKMBd(), rx.AuCTel(), rx, executor);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: o.RU */
    /* JADX WARN: Multi-variable type inference failed */
    public final RV copydefault(java.lang.Object obj, InterfaceC5462Sq<TranscodeType> interfaceC5462Sq, @androidx.annotation.Nullable RY<TranscodeType> ry, @androidx.annotation.Nullable RequestCoordinator requestCoordinator, AbstractC5334Ns<?, ? super TranscodeType> abstractC5334Ns, Priority priority, int i, int i2, RX<?> rx, java.util.concurrent.Executor executor) {
        RequestCoordinator requestCoordinator2;
        RequestCoordinator ru;
        if (this.OLrzqt != null) {
            ru = new RU(obj, requestCoordinator);
            requestCoordinator2 = ru;
        } else {
            requestCoordinator2 = null;
            ru = requestCoordinator;
        }
        RV rvAEQbTJ = AEQbTJ(obj, interfaceC5462Sq, ry, ru, abstractC5334Ns, priority, i, i2, rx, executor);
        if (requestCoordinator2 == null) {
            return rvAEQbTJ;
        }
        int iHDKMBd = this.OLrzqt.hDKMBd();
        int iAuCTel = this.OLrzqt.AuCTel();
        if (SI.OLrzqt(i, i2) && !this.OLrzqt.RJOkX()) {
            iHDKMBd = rx.hDKMBd();
            iAuCTel = rx.AuCTel();
        }
        C5335Nt<TranscodeType> c5335Nt = this.OLrzqt;
        RU ru2 = requestCoordinator2;
        ru2.copydefault(rvAEQbTJ, c5335Nt.copydefault(obj, interfaceC5462Sq, ry, ru2, c5335Nt.fetchVPNInfo, c5335Nt.getNewProxyInstance(), iHDKMBd, iAuCTel, this.OLrzqt, executor));
        return ru2;
    }

    public final RV AEQbTJ(java.lang.Object obj, InterfaceC5462Sq<TranscodeType> interfaceC5462Sq, RY<TranscodeType> ry, @androidx.annotation.Nullable RequestCoordinator requestCoordinator, AbstractC5334Ns<?, ? super TranscodeType> abstractC5334Ns, Priority priority, int i, int i2, RX<?> rx, java.util.concurrent.Executor executor) {
        Priority priorityEZpvd;
        C5335Nt<TranscodeType> c5335Nt = this.values;
        if (c5335Nt == null) {
            if (this.DbNXlk != null) {
                C5447Sb c5447Sb = new C5447Sb(obj, requestCoordinator);
                c5447Sb.EZpvd(KWHzl(obj, interfaceC5462Sq, ry, rx, c5447Sb, abstractC5334Ns, priority, i, i2, executor), KWHzl(obj, interfaceC5462Sq, ry, rx.copydefault().EZpvd(this.DbNXlk.floatValue()), c5447Sb, abstractC5334Ns, EZpvd(priority), i, i2, executor));
                return c5447Sb;
            }
            return KWHzl(obj, interfaceC5462Sq, ry, rx, requestCoordinator, abstractC5334Ns, priority, i, i2, executor);
        }
        if (this.AhwBna) {
            throw new java.lang.IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        AbstractC5334Ns<?, ? super TranscodeType> abstractC5334Ns2 = c5335Nt.AYXKKw ? abstractC5334Ns : c5335Nt.fetchVPNInfo;
        if (c5335Nt.zuBGHE()) {
            priorityEZpvd = this.values.getNewProxyInstance();
        } else {
            priorityEZpvd = EZpvd(priority);
        }
        Priority priority2 = priorityEZpvd;
        int iHDKMBd = this.values.hDKMBd();
        int iAuCTel = this.values.AuCTel();
        if (SI.OLrzqt(i, i2) && !this.values.RJOkX()) {
            iHDKMBd = rx.hDKMBd();
            iAuCTel = rx.AuCTel();
        }
        C5447Sb c5447Sb2 = new C5447Sb(obj, requestCoordinator);
        RV rvKWHzl = KWHzl(obj, interfaceC5462Sq, ry, rx, c5447Sb2, abstractC5334Ns, priority, i, i2, executor);
        this.AhwBna = true;
        C5335Nt<TranscodeType> c5335Nt2 = this.values;
        RV rvCopydefault = c5335Nt2.copydefault(obj, interfaceC5462Sq, ry, c5447Sb2, abstractC5334Ns2, priority2, iHDKMBd, iAuCTel, c5335Nt2, executor);
        this.AhwBna = false;
        c5447Sb2.EZpvd(rvKWHzl, rvCopydefault);
        return c5447Sb2;
    }

    public final RV KWHzl(java.lang.Object obj, InterfaceC5462Sq<TranscodeType> interfaceC5462Sq, RY<TranscodeType> ry, RX<?> rx, RequestCoordinator requestCoordinator, AbstractC5334Ns<?, ? super TranscodeType> abstractC5334Ns, Priority priority, int i, int i2, java.util.concurrent.Executor executor) {
        android.content.Context context = this.KWHzl;
        C5330No c5330No = this.copydefault;
        return SingleRequest.OLrzqt(context, c5330No, obj, this.valueOf, this.AkhnZx, rx, i, i2, priority, interfaceC5462Sq, ry, this.djBIcL, requestCoordinator, c5330No.OLrzqt(), abstractC5334Ns.copydefault(), executor);
    }

    @Override // o.RX
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5335Nt) {
            C5335Nt c5335Nt = (C5335Nt) obj;
            if (super.equals(c5335Nt) && Objects.equals(this.AkhnZx, c5335Nt.AkhnZx) && this.fetchVPNInfo.equals(c5335Nt.fetchVPNInfo) && Objects.equals(this.valueOf, c5335Nt.valueOf) && Objects.equals(this.djBIcL, c5335Nt.djBIcL) && Objects.equals(this.values, c5335Nt.values) && Objects.equals(this.OLrzqt, c5335Nt.OLrzqt) && Objects.equals(this.DbNXlk, c5335Nt.DbNXlk) && this.AYXKKw == c5335Nt.AYXKKw && this.gEmmrt == c5335Nt.gEmmrt) {
                return true;
            }
        }
        return false;
    }

    @Override // o.RX
    public int hashCode() {
        return SI.OLrzqt(this.gEmmrt, SI.OLrzqt(this.AYXKKw, SI.OLrzqt(this.DbNXlk, SI.OLrzqt(this.OLrzqt, SI.OLrzqt(this.values, SI.OLrzqt(this.djBIcL, SI.OLrzqt(this.valueOf, SI.OLrzqt(this.fetchVPNInfo, SI.OLrzqt(this.AkhnZx, super.hashCode())))))))));
    }
}
