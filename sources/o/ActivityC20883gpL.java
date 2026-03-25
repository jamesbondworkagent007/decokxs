package o;

import android.os.Build;
import android.view.View;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.TransferAddressData;
import com.okinc.business.defi.common.utils.CDNSourceManager;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressWithMemo;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC20383gfp;
import o.ActivityC20883gpL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gpL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC20883gpL extends AbstractActivityC33013moT {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.gpM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC20883gpL.KWHzl();
        }
    });
    public final java.util.ArrayList<AddressWithMemo> EZpvd = new java.util.ArrayList<>();
    public MultiTransferSignData OLrzqt;
    public AbstractC16351eiL copydefault;

    /* JADX INFO: renamed from: o.gpL$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gpL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull java.util.ArrayList<AddressWithMemo> arrayList, @NotNull MultiTransferSignData multiTransferSignData) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(multiTransferSignData, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC20883gpL.class);
            intent.putExtra("address_list", arrayList);
            intent.putExtra("multi_transfer_sign_data", multiTransferSignData);
            return intent;
        }
    }

    private final C43316rmw EZpvd() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw KWHzl() {
        return new C43316rmw();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(android.os.Bundle bundle) {
        java.util.List parcelableArrayListExtra;
        MultiTransferSignData multiTransferSignData;
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        setForceDismiss(false);
        AbstractC16351eiL abstractC16351eiLOLrzqt = AbstractC16351eiL.OLrzqt(getLayoutInflater());
        this.copydefault = abstractC16351eiLOLrzqt;
        if (abstractC16351eiLOLrzqt == null) {
            Intrinsics.gEmmrt("");
            abstractC16351eiLOLrzqt = null;
        }
        setContentView(abstractC16351eiLOLrzqt.getRoot());
        AEQbTJ();
        AbstractC16351eiL abstractC16351eiL = this.copydefault;
        if (abstractC16351eiL == null) {
            Intrinsics.gEmmrt("");
            abstractC16351eiL = null;
        }
        abstractC16351eiL.EZpvd.setAdapter(EZpvd());
        AbstractC16351eiL abstractC16351eiL2 = this.copydefault;
        if (abstractC16351eiL2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16351eiL2 = null;
        }
        android.widget.ImageView imageView = abstractC16351eiL2.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C14677dpv.OLrzqt(imageView, CDNSourceManager.ImageSource.MultiTransferConfirmImage);
        EZpvd().register(AddressWithMemo.class, new C20834goP(new yHO() { // from class: o.gpN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC20883gpL.EZpvd(this.copydefault, ((java.lang.Integer) obj).intValue(), (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        }));
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            android.content.Intent intent = getIntent();
            parcelableArrayListExtra = intent != null ? intent.getParcelableArrayListExtra("address_list", AddressWithMemo.class) : null;
        } else {
            android.content.Intent intent2 = getIntent();
            if (intent2 != null) {
                parcelableArrayListExtra = intent2.getParcelableArrayListExtra("address_list");
            }
        }
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = yDY.AhwBna();
        }
        this.EZpvd.addAll(parcelableArrayListExtra);
        C33064mpR.OLrzqt(EZpvd(), (java.util.List<? extends java.lang.Object>) this.EZpvd);
        if (i >= 33) {
            android.content.Intent intent3 = getIntent();
            multiTransferSignData = intent3 != null ? (MultiTransferSignData) intent3.getParcelableExtra("multi_transfer_sign_data", MultiTransferSignData.class) : null;
        } else {
            android.content.Intent intent4 = getIntent();
            if (intent4 != null) {
                multiTransferSignData = (MultiTransferSignData) intent4.getParcelableExtra("multi_transfer_sign_data");
            }
        }
        this.OLrzqt = multiTransferSignData;
        AbstractC16351eiL abstractC16351eiL3 = this.copydefault;
        if (abstractC16351eiL3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16351eiL3 = null;
        }
        C52794wYp c52794wYp = abstractC16351eiL3.OLrzqt;
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        C32866mlf.onEvent$default("AppMultisender_ReceivingAddress_TonCommentInput_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.gpO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC20883gpL.EZpvd(this.AEQbTJ);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[EDGE_INSN: B:24:0x0048->B:21:0x0048 BREAK  A[LOOP:0: B:14:0x002d->B:26:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(ActivityC20883gpL activityC20883gpL, int i, java.lang.String str, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(str, "");
        AddressWithMemo addressWithMemo = (AddressWithMemo) CollectionsKt___CollectionsKt.AkhnZx(activityC20883gpL.EZpvd, i);
        if (addressWithMemo != null) {
            addressWithMemo.setMemo(str);
        }
        AbstractC16351eiL abstractC16351eiL = activityC20883gpL.copydefault;
        if (abstractC16351eiL == null) {
            Intrinsics.gEmmrt("");
            abstractC16351eiL = null;
        }
        C52794wYp c52794wYp = abstractC16351eiL.OLrzqt;
        java.util.ArrayList<AddressWithMemo> arrayList = activityC20883gpL.EZpvd;
        if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) ((AddressWithMemo) it.next()).getMemo())) {
                    break;
                }
            }
            z2 = z;
        } else if (z) {
        }
        c52794wYp.setEnabled(z2);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ActivityC20883gpL activityC20883gpL) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC20883gpL, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        android.content.Intent intent = getIntent();
        intent.putExtra("address_list", this.EZpvd);
        Unit unit = Unit.INSTANCE;
        setResult(0, intent);
        super.onBackPressed();
    }

    /* JADX INFO: renamed from: o.gpL$Activity */
    public static final class Activity implements InterfaceC59496ziD {
        public Activity() {
        }

        @Override // o.InterfaceC59496ziD
        public void OLrzqt(boolean z) {
            AbstractC16351eiL abstractC16351eiL = null;
            if (z) {
                AbstractC16351eiL abstractC16351eiL2 = ActivityC20883gpL.this.copydefault;
                if (abstractC16351eiL2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16351eiL = abstractC16351eiL2;
                }
                C52794wYp c52794wYp = abstractC16351eiL.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
                c52794wYp.setVisibility(8);
                return;
            }
            AbstractC16351eiL abstractC16351eiL3 = ActivityC20883gpL.this.copydefault;
            if (abstractC16351eiL3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16351eiL = abstractC16351eiL3;
            }
            C52794wYp c52794wYp2 = abstractC16351eiL.OLrzqt;
            final ActivityC20883gpL activityC20883gpL = ActivityC20883gpL.this;
            c52794wYp2.postDelayed(new java.lang.Runnable() { // from class: o.gpR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC20883gpL.Activity.OLrzqt(activityC20883gpL);
                }
            }, 100L);
        }

        public static final void OLrzqt(ActivityC20883gpL activityC20883gpL) {
            android.view.View currentFocus = activityC20883gpL.getCurrentFocus();
            if (currentFocus != null) {
                currentFocus.clearFocus();
            }
            AbstractC16351eiL abstractC16351eiL = activityC20883gpL.copydefault;
            if (abstractC16351eiL == null) {
                Intrinsics.gEmmrt("");
                abstractC16351eiL = null;
            }
            C52794wYp c52794wYp = abstractC16351eiL.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(0);
        }
    }

    private final void AEQbTJ() {
        C59541ziw.KWHzl(this, new Activity());
    }

    /* JADX INFO: renamed from: o.gpL$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ActivityC20883gpL EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC20883gpL activityC20883gpL) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = activityC20883gpL;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.util.ArrayList<TransferAddressData> toAddress;
            TransferAddressData transferAddressData;
            java.util.ArrayList<java.lang.String> fromAddress;
            java.util.ArrayList<TransferAddressData> toAddress2;
            TransferAddressData transferAddressData2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C32866mlf.onEvent$default("AppMultisender_ReceivingAddress_TonCommentInput_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                MultiTransferSignData multiTransferSignData = this.EZpvd.OLrzqt;
                if (multiTransferSignData != null && multiTransferSignData.getTransferType() == 2) {
                    MultiTransferSignData multiTransferSignData2 = this.EZpvd.OLrzqt;
                    if (multiTransferSignData2 != null && (fromAddress = multiTransferSignData2.getFromAddress()) != null) {
                        int i = 0;
                        for (java.lang.Object obj : fromAddress) {
                            if (i < 0) {
                                yDY.AYXKKw();
                            }
                            MultiTransferSignData multiTransferSignData3 = this.EZpvd.OLrzqt;
                            if (multiTransferSignData3 != null && (toAddress2 = multiTransferSignData3.getToAddress()) != null && (transferAddressData2 = (TransferAddressData) CollectionsKt___CollectionsKt.AkhnZx(toAddress2, i)) != null) {
                                AddressWithMemo addressWithMemo = (AddressWithMemo) CollectionsKt___CollectionsKt.firstOrNull(this.EZpvd.EZpvd);
                                transferAddressData2.setMemo(addressWithMemo != null ? addressWithMemo.getMemo() : null);
                            }
                            i++;
                        }
                    }
                } else {
                    for (AddressWithMemo addressWithMemo2 : this.EZpvd.EZpvd) {
                        MultiTransferSignData multiTransferSignData4 = this.EZpvd.OLrzqt;
                        if (multiTransferSignData4 != null && (toAddress = multiTransferSignData4.getToAddress()) != null && (transferAddressData = (TransferAddressData) CollectionsKt___CollectionsKt.AkhnZx(toAddress, addressWithMemo2.getIndex())) != null) {
                            transferAddressData.setMemo(addressWithMemo2.getMemo());
                        }
                    }
                }
                ActivityC20883gpL activityC20883gpL = this.EZpvd;
                ActivityC20383gfp.StateListAnimator stateListAnimator = ActivityC20383gfp.Companion;
                MultiTransferSignData multiTransferSignData5 = activityC20883gpL.OLrzqt;
                if (multiTransferSignData5 == null) {
                    return;
                }
                android.content.Intent intentAEQbTJ = stateListAnimator.AEQbTJ(activityC20883gpL, multiTransferSignData5);
                intentAEQbTJ.addFlags(MediaHttpDownloader.MAXIMUM_CHUNK_SIZE);
                activityC20883gpL.startActivity(intentAEQbTJ);
                this.EZpvd.finish();
            }
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
