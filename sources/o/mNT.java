package o;

import android.view.View;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;
import o.C52761wXj;
import o.mND;
import o.mNT;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mNT implements mNN, mNK {
    public static ViewOnClickListenerC32061mOa AYXKKw;
    public static InterfaceC32938mmy EZpvd;
    public static boolean KWHzl;
    public static final mNT copydefault = new mNT();
    public static final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.mOb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return mNT.DbNXlk();
        }
    });
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.mNZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return mNT.valueOf();
        }
    });
    public static final int AEQbTJ = 8;

    @Override // o.mNK
    public void AEQbTJ() {
    }

    @Override // o.mNN
    public void AYXKKw() {
    }

    @Override // o.mNN
    public void EZpvd() {
    }

    @Override // o.mNN
    public void KWHzl() {
    }

    @Override // o.mNN
    public void OLrzqt() {
    }

    @Override // o.mNN
    public void OLrzqt(int i, int i2) {
    }

    @Override // o.mNN
    public void bi_() {
    }

    @Override // o.mNK
    public void bj_() {
    }

    @Override // o.mNN
    public void copydefault() {
    }

    private mNT() {
    }

    public final C32069mOi isConnected() {
        return (C32069mOi) djBIcL.getValue();
    }

    public static final C32069mOi DbNXlk() {
        return new C32069mOi();
    }

    public final C32937mmx AkhnZx() {
        return (C32937mmx) OLrzqt.getValue();
    }

    public static final C32937mmx valueOf() {
        return new C32937mmx();
    }

    public static /* synthetic */ void startMonitor$default(mNT mnt, android.content.Context context, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        mnt.copydefault(context, z);
    }

    public final void copydefault(@NotNull android.content.Context context, boolean z) {
        ViewOnClickListenerC32061mOa viewOnClickListenerC32061mOa;
        Intrinsics.checkNotNullParameter(context, "");
        if (!KWHzl) {
            copydefault(context);
            KWHzl = true;
        }
        if (z) {
            ejfBZ();
        } else {
            fetchVPNInfo();
        }
        if (EZpvd == null && (viewOnClickListenerC32061mOa = AYXKKw) != null) {
            mNX mnx = new mNX(viewOnClickListenerC32061mOa);
            C32872mll c32872mll = C32872mll.OLrzqt;
            final mNT mnt = copydefault;
            AbstractC32875mlo.addLogEventInterceptor$default(c32872mll, mnt.AkhnZx(), 0, 2, null);
            mnt.copydefault(mnx);
            EZpvd = mnx;
            RxBus.AEQbTJ("analytics_init_end").subscribe(new RxBus.EventCallback<java.lang.String>(mnt) { // from class: com.okinc.debugbox.track.TrackDebugManager$startMonitor$1$2
                {
                    super(mnt);
                }

                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(String str) {
                    Intrinsics.checkNotNullParameter(str, "");
                    pUU.KWHzl("TrackDebugManager", "analytics_init_end, register monitor!");
                    mNT.copydefault.copydefault(mNT.EZpvd);
                }
            });
        }
        isConnected().setChecked(true);
    }

    public final void copydefault(InterfaceC32938mmy interfaceC32938mmy) {
        if (interfaceC32938mmy != null) {
            for (InterfaceC32904mmQ interfaceC32904mmQ : C32872mll.OLrzqt.AYXKKw()) {
                if (interfaceC32904mmQ instanceof InterfaceC32889mmB) {
                    ((InterfaceC32889mmB) interfaceC32904mmQ).AEQbTJ(interfaceC32938mmy);
                }
            }
        }
    }

    public final void copydefault(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setImageResource(C31976mKx.ActionBar.gEmmrt);
        mND.KWHzl(context).EZpvd(imageView).AEQbTJ("TRACK_THUMB").copydefault(0).AEQbTJ(1, 0.7f).KWHzl(3).EZpvd(this).AEQbTJ(this).KWHzl(true).KWHzl();
        if (AYXKKw == null) {
            AYXKKw = new ViewOnClickListenerC32061mOa(new androidx.appcompat.view.ContextThemeWrapper(context, C52761wXj.LoaderManager.fvQaOB), null, 0, 6, null);
        }
        mND.StateListAnimator stateListAnimatorKWHzl = mND.KWHzl(context);
        ViewOnClickListenerC32061mOa viewOnClickListenerC32061mOa = AYXKKw;
        Intrinsics.copydefault(viewOnClickListenerC32061mOa);
        stateListAnimatorKWHzl.EZpvd(viewOnClickListenerC32061mOa).AEQbTJ("TRACK_FLOAT").copydefault(0, 1.0f).OLrzqt(0, 0.0f).AEQbTJ(1, 0.2f).KWHzl(3).EZpvd(this).AEQbTJ(this).KWHzl(true).KWHzl();
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.mNY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mNT.AEQbTJ(view);
            }
        });
    }

    public static final void AEQbTJ(android.view.View view) {
        copydefault.ejfBZ();
    }

    public final void values() {
        mND.EZpvd("TRACK_THUMB");
        mND.EZpvd("TRACK_FLOAT");
        AYXKKw = null;
        for (InterfaceC32904mmQ interfaceC32904mmQ : C32872mll.OLrzqt.values()) {
            if (interfaceC32904mmQ instanceof InterfaceC32889mmB) {
                ((InterfaceC32889mmB) interfaceC32904mmQ).KWHzl();
            }
        }
        C32872mll.OLrzqt.KWHzl(AkhnZx());
        EZpvd = null;
        isConnected().setChecked(false);
        KWHzl = false;
    }

    public final void fetchVPNInfo() {
        mNF mnfOLrzqt = mND.OLrzqt("TRACK_THUMB");
        if (mnfOLrzqt != null) {
            mnfOLrzqt.isConnected();
        }
        mNF mnfOLrzqt2 = mND.OLrzqt("TRACK_FLOAT");
        if (mnfOLrzqt2 != null) {
            mnfOLrzqt2.djBIcL();
        }
    }

    public final void ejfBZ() {
        mNF mnfOLrzqt = mND.OLrzqt("TRACK_THUMB");
        if (mnfOLrzqt != null) {
            mnfOLrzqt.djBIcL();
        }
        mNF mnfOLrzqt2 = mND.OLrzqt("TRACK_FLOAT");
        if (mnfOLrzqt2 != null) {
            mnfOLrzqt2.isConnected();
        }
    }
}
