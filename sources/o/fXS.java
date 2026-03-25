package o;

import android.view.View;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.components.track.TrackChannel;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C20540gin;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fXS extends AbstractActivityC17933fXr implements InterfaceC20523giW {
    public int AuCTel;
    public android.view.View ejfBZ;
    public android.widget.TextView fARcdN;
    public android.widget.ImageView fIwbmz;
    public SignDataArgs<?> hDKMBd;
    public android.widget.ImageView uzCIH;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int values = 8;
    public static final java.util.HashMap<java.lang.String, SignDataArgs<?>> fetchVPNInfo = new java.util.HashMap<>();
    public static final java.util.ArrayList<java.lang.String> DbNXlk = new java.util.ArrayList<>();
    public final java.util.HashMap<java.lang.String, SignDataArgs<?>> getFieldNames = new java.util.HashMap<>();
    public final java.util.ArrayList<java.lang.String> getNewProxyInstance = new java.util.ArrayList<>();
    public final boolean fJNWhG = true;
    public Function0<Unit> isConnected = new Function0() { // from class: o.fXX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return fXS.valueOf(this.OLrzqt);
        }
    };

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKWBaseTransaction.TransactionType.values().length];
            try {
                iArr[OKWBaseTransaction.TransactionType.CancelApprove.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC17933fXr
    public boolean valueOf() {
        return this.fJNWhG;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fXS.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, @NotNull java.util.List<? extends SignDataArgs<?>> list) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            android.content.Intent intentEZpvd = EZpvd(list);
            intentEZpvd.setClass(context, fXS.class);
            return intentEZpvd;
        }

        public final android.content.Intent EZpvd(@NotNull java.util.List<? extends SignDataArgs<?>> list) {
            Intrinsics.checkNotNullParameter(list, "");
            android.content.Intent intent = new android.content.Intent();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                SignDataArgs signDataArgs = (SignDataArgs) it.next();
                java.lang.String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                fXS.fetchVPNInfo.put(string, signDataArgs);
                fXS.DbNXlk.add(string);
            }
            return intent;
        }
    }

    public static final Unit valueOf(fXS fxs) {
        fxs.getFieldNames.remove(fxs.getNewProxyInstance.get(fxs.AuCTel));
        fxs.getNewProxyInstance.remove(fxs.AuCTel);
        if (fxs.AuCTel > fxs.getNewProxyInstance.size() - 1) {
            fxs.AuCTel = 0;
        }
        if (fxs.getNewProxyInstance.isEmpty()) {
            fxs.finish();
        } else {
            fxs.fIwbmz();
            fxs.values();
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC17933fXr, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.clear();
        }
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        this.ejfBZ = findViewById(C13754dXa.ActionBar.gFTCsA);
        this.getNewProxyInstance.clear();
        java.util.ArrayList<java.lang.String> arrayList = this.getNewProxyInstance;
        java.util.ArrayList<java.lang.String> arrayList2 = DbNXlk;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        this.getFieldNames.clear();
        for (Map.Entry<java.lang.String, SignDataArgs<?>> entry : fetchVPNInfo.entrySet()) {
            this.getFieldNames.put(entry.getKey(), entry.getValue());
        }
        fetchVPNInfo.clear();
        AkhnZx();
        values();
    }

    public final void AkhnZx() {
        if (this.getNewProxyInstance.size() <= 1) {
            return;
        }
        android.view.View viewFindViewById = findViewById(android.R.id.content);
        Intrinsics.copydefault(viewFindViewById, "");
        android.view.View childAt = ((android.view.ViewGroup) viewFindViewById).getChildAt(0);
        Intrinsics.copydefault(childAt, "");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) childAt;
        android.view.View viewInflate = android.view.LayoutInflater.from(this).inflate(C13754dXa.TaskDescription.QzqeNH, (android.view.ViewGroup) linearLayout, false);
        linearLayout.addView(viewInflate, 1);
        this.fARcdN = (android.widget.TextView) viewInflate.findViewById(C13754dXa.ActionBar.PlaybackStateCompatBuilder);
        this.fIwbmz = (android.widget.ImageView) viewInflate.findViewById(C13754dXa.ActionBar.getPostValueLengthLimit);
        this.uzCIH = (android.widget.ImageView) viewInflate.findViewById(C13754dXa.ActionBar.OuxcSI);
        fIwbmz();
        android.widget.ImageView imageView = this.fIwbmz;
        android.widget.ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.gEmmrt("");
            imageView = null;
        }
        imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, this));
        android.widget.ImageView imageView3 = this.uzCIH;
        if (imageView3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imageView2 = imageView3;
        }
        imageView2.setOnClickListener(new Activity(imageView2, 1000L, this));
    }

    public final void fIwbmz() {
        android.widget.TextView textView = this.fARcdN;
        android.widget.ImageView imageView = null;
        if (textView == null) {
            Intrinsics.gEmmrt("");
            textView = null;
        }
        textView.setText(C33069mpW.KWHzl(this, C13754dXa.FragmentManager.gISBfG, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("num", java.lang.String.valueOf(this.AuCTel + 1)), C56390yDp.OLrzqt("total", java.lang.String.valueOf(this.getNewProxyInstance.size())))));
        android.widget.ImageView imageView2 = this.fIwbmz;
        if (imageView2 == null) {
            Intrinsics.gEmmrt("");
            imageView2 = null;
        }
        imageView2.setVisibility(this.AuCTel == 0 ? 4 : 0);
        android.widget.ImageView imageView3 = this.uzCIH;
        if (imageView3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            imageView = imageView3;
        }
        imageView.setVisibility(this.AuCTel != this.getNewProxyInstance.size() + (-1) ? 0 : 4);
    }

    public final void values() {
        java.lang.Object obj = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(this.getNewProxyInstance, this.AuCTel);
        if (obj == null) {
            finish();
            obj = Unit.INSTANCE;
        }
        final SignDataArgs<?> signDataArgs = this.getFieldNames.get(obj);
        C33537myN c33537myN = (C33537myN) findViewById(C13754dXa.ActionBar.accept);
        if (signDataArgs != null) {
            AEQbTJ(true);
            signDataArgs.setChangedCustomRpc(false);
            this.hDKMBd = signDataArgs;
            if (c33537myN == null) {
                finish();
                return;
            }
            C55173xeu c55173xeu = (C55173xeu) findViewById(C13754dXa.ActionBar.RihMUf);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNLfdT));
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk));
            c55173xeu.setImage(C52761wXj.TaskDescription.getSerial);
            C8003auW.copydefault(c55173xeu.AEQbTJ()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.fXT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    fXS.copydefault(this.EZpvd, signDataArgs, obj2);
                }
            });
            copydefault(signDataArgs);
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ fXS copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, fXS fxs) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = fxs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                fXS fxs = this.copydefault;
                fxs.AuCTel = (fxs.AuCTel + 1) % this.copydefault.getNewProxyInstance.size();
                this.copydefault.fIwbmz();
                this.copydefault.values();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ fXS OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, fXS fxs) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = fxs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.AuCTel = (r7.AuCTel - 1) % this.OLrzqt.getNewProxyInstance.size();
                this.OLrzqt.fIwbmz();
                this.OLrzqt.values();
            }
        }
    }

    public static final void copydefault(fXS fxs, SignDataArgs signDataArgs, java.lang.Object obj) {
        android.view.View view = fxs.ejfBZ;
        if (view == null) {
            Intrinsics.gEmmrt("");
            view = null;
        }
        view.setVisibility(8);
        fxs.copydefault((SignDataArgs<?>) signDataArgs);
    }

    @Override // o.AbstractActivityC17933fXr
    public void AEQbTJ(@NotNull OKWBaseTransaction<?> oKWBaseTransaction) {
        AbstractC20082gaF abstractC20082gaF;
        AbstractC20082gaF abstractC20082gaF2;
        Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
        C10854bwM c10854bwMDHguZz = oKWBaseTransaction.dHguZz();
        if (Application.KWHzl[oKWBaseTransaction.aUsmxb().ordinal()] == 1) {
            if (oKWBaseTransaction.DCUTEIddSDPG()) {
                C20540gin.ActionBar actionBar = C20540gin.Companion;
                C20540gin c20540gin = new C20540gin();
                c20540gin.EZpvd(this.isConnected);
                c20540gin.OLrzqt(this.isConnected);
                c20540gin.KWHzl(true);
                abstractC20082gaF2 = c20540gin;
            } else if (c10854bwMDHguZz.QkdxfA()) {
                if (oKWBaseTransaction.zblBkD()) {
                    C20250gdO c20250gdO = new C20250gdO();
                    c20250gdO.OLrzqt(this.isConnected);
                    abstractC20082gaF = c20250gdO;
                } else {
                    C20207gcY c20207gcY = new C20207gcY();
                    c20207gcY.OLrzqt(this.isConnected);
                    abstractC20082gaF = c20207gcY;
                }
                abstractC20082gaF.EZpvd(this.isConnected);
                abstractC20082gaF.KWHzl(true);
                abstractC20082gaF2 = abstractC20082gaF;
            } else {
                if (!c10854bwMDHguZz.run()) {
                    return;
                }
                C20207gcY c20207gcY2 = new C20207gcY();
                c20207gcY2.EZpvd(this.isConnected);
                c20207gcY2.OLrzqt(this.isConnected);
                c20207gcY2.KWHzl(true);
                abstractC20082gaF2 = c20207gcY2;
            }
            getSupportFragmentManager().beginTransaction().replace(C13754dXa.ActionBar.DfrfUJ, abstractC20082gaF2).commitAllowingStateLoss();
            C32866mlf.onEvent$default("AllConfirmation_Full_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
    }

    @Override // o.AbstractActivityC17933fXr, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC17933fXr, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC17933fXr, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC17933fXr, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
