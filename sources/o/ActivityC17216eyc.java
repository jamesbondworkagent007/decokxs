package o;

import android.view.View;
import androidx.autofill.HintConstants;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.net.HttpHeaders;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.biz.util.UploadUtils;
import com.okinc.business.defi.biz.drivers.bean.HDWalletBackupTypeBean;
import com.okinc.business.defi.biz.drivers.bean.HDWalletCloudBackupBean;
import com.okinc.business.defi.wallet.debug.WalletDebugListActivity$ItemWalletDebugTemplate$onBindViewHolder$1$1;
import com.okinc.business.defi.wallet.debug.WalletDebugSettingType;
import com.okinc.debugbox.bean.OssUploadResp;
import com.okinc.network.okg.response.BaseResp;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC17216eyc;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eyc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC17216eyc extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public AbstractC16436ejr KWHzl;
    public final java.util.ArrayList<C17227eyn> copydefault = new java.util.ArrayList<>();
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.eyi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC17216eyc.AhwBna();
        }
    });

    /* JADX INFO: renamed from: o.eyc$ActionBar */
    public static final class ActionBar extends TypeToken<BaseResp<OssUploadResp>> {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C59534zip AhwBna() {
        return new C59534zip();
    }

    private final C59534zip KWHzl() {
        return (C59534zip) this.OLrzqt.getValue();
    }

    /* JADX INFO: renamed from: o.eyc$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eyc.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC17216eyc.class));
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        RecyclerView recyclerView;
        C33537myN c33537myN;
        super.onCreate(bundle);
        AbstractC16436ejr abstractC16436ejr = (AbstractC16436ejr) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.QVsKAR);
        this.KWHzl = abstractC16436ejr;
        if (abstractC16436ejr != null && (c33537myN = abstractC16436ejr.AEQbTJ) != null) {
            c33537myN.setTitle("钱包工具 (Wallet tools)");
        }
        AbstractC16436ejr abstractC16436ejr2 = this.KWHzl;
        if (abstractC16436ejr2 != null && (recyclerView = abstractC16436ejr2.KWHzl) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(KWHzl());
        }
        KWHzl().register(C17227eyn.class, new StateListAnimator());
        EZpvd();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eyg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC17216eyc.KWHzl(this.copydefault);
            }
        });
    }

    public static final void KWHzl(ActivityC17216eyc activityC17216eyc) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17216eyc, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void EZpvd() {
        this.copydefault.clear();
        java.util.ArrayList<C17227eyn> arrayList = this.copydefault;
        arrayList.add(new C17227eyn(WalletDebugSettingType.WALLET_DIAGNOSIS, "钱包诊断 (Wallet diagnosis)", ""));
        arrayList.add(new C17227eyn(WalletDebugSettingType.DECODE_TX, "签名解析 (Decode raw transaction)", ""));
        arrayList.add(new C17227eyn(WalletDebugSettingType.CLOUD_BACKUP, "云备份诊断 (Cloud backup diagnosis)", ""));
        arrayList.add(new C17227eyn(WalletDebugSettingType.MPC_CLOUD_BACKUP, "MPC云备份诊断 (Mpc backup diagnosis)", ""));
        arrayList.add(new C17227eyn(WalletDebugSettingType.EXPORT_NOSTR_KEY, "导出Nostr私钥 (Export the Nostr private key)", ""));
        C33064mpR.OLrzqt(KWHzl(), this.copydefault);
    }

    public final void copydefault() {
        showLoading();
        java.io.File file = new java.io.File("data/data/" + getPackageName() + "/app_flutter/wallet");
        java.io.File file2 = new java.io.File(getFilesDir() + "/wallet.realm");
        java.io.File file3 = new java.io.File("data/data/" + getPackageName() + "/databases/wallet.db");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (file.exists()) {
            arrayList.add(file.getAbsolutePath());
        }
        if (file2.exists()) {
            arrayList.add(file2.getAbsolutePath());
        }
        if (file3.exists()) {
            arrayList.add(file3.getAbsolutePath());
        }
        if (arrayList.size() > 0) {
            try {
                ossUpload$default(this, new java.io.File(C17226eym.copydefault(arrayList, getFilesDir() + "/walletZip.Zip")), false, 2, null);
            } catch (java.lang.Exception e) {
                dismissLoading();
                android.util.Log.getStackTraceString(e);
            }
        }
    }

    public static /* synthetic */ void ossUpload$default(ActivityC17216eyc activityC17216eyc, java.io.File file, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        activityC17216eyc.AEQbTJ(file, z);
    }

    public final void AEQbTJ(final java.io.File file, final boolean z) {
        AbstractC58185ywX abstractC58185ywXEZpvd;
        java.util.HashMap map = new java.util.HashMap();
        map.put("file", file);
        dZP dzp = dZP.OLrzqt;
        map.put("userid", dzp.valueOf() ? dzp.EZpvd() : "0");
        map.put(HintConstants.AUTOFILL_HINT_USERNAME, dzp.valueOf() ? dzp.OLrzqt() : "0");
        map.put("timestamp", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)));
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put(HttpHeaders.REFERER, C43292rmY.OLrzqt.fJNWhG());
        map2.put("x-utc", C6848aXC.EZpvd.EZpvd());
        if (dzp.AkhnZx() != null) {
            map2.put("Authorization", dzp.AkhnZx());
        }
        if (!android.text.TextUtils.isEmpty(xVW.copydefault())) {
            map2.put("devId", xVW.copydefault());
        }
        AbstractC58185ywX abstractC58185ywXUploadFile$default = UploadUtils.uploadFile$default(UploadUtils.OLrzqt, C6813aWU.AEQbTJ("/v1/deposit/app/wallet/file/upload"), map, new ActionBar(), map2, null, 16, null);
        if (abstractC58185ywXUploadFile$default != null) {
            final Function1 function1 = new Function1() { // from class: o.eyf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC17216eyc.EZpvd(z, file, this, (java.lang.Throwable) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXOLrzqt = abstractC58185ywXUploadFile$default.OLrzqt(new InterfaceC58227yxM() { // from class: o.eyb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC17216eyc.KWHzl(function1, obj);
                }
            });
            if (abstractC58185ywXOLrzqt == null || (abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXOLrzqt, this)) == null) {
                return;
            }
            final Function1 function12 = new Function1() { // from class: o.eyk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC17216eyc.KWHzl(z, file, this, (BaseResp) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.eyh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC17216eyc.EZpvd(function12, obj);
                }
            });
        }
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(boolean z, java.io.File file, ActivityC17216eyc activityC17216eyc, java.lang.Throwable th) {
        if (z) {
            file.delete();
        }
        C33134mqi.AEQbTJ(activityC17216eyc.getString(C13754dXa.FragmentManager.DUUtXg));
        activityC17216eyc.dismissLoading();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(boolean z, java.io.File file, ActivityC17216eyc activityC17216eyc, BaseResp baseResp) {
        if (z) {
            file.delete();
        }
        activityC17216eyc.dismissLoading();
        if (baseResp.code == 0) {
            C33134mqi.AEQbTJ("upload success");
        } else {
            C33134mqi.AEQbTJ(baseResp.msg);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.eyc$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final class StateListAnimator extends AbstractC43310rmq<C17227eyn, AbstractC16921esz> {

        /* JADX INFO: renamed from: o.eyc$StateListAnimator$Application */
        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[WalletDebugSettingType.values().length];
                try {
                    iArr[WalletDebugSettingType.WALLET_DIAGNOSIS.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[WalletDebugSettingType.DECODE_TX.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[WalletDebugSettingType.CLOUD_BACKUP.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[WalletDebugSettingType.MPC_CLOUD_BACKUP.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[WalletDebugSettingType.EXPORT_NOSTR_KEY.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[WalletDebugSettingType.SHOW_WEB3.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[WalletDebugSettingType.REFERRAL_MANAGERMENT.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                EZpvd = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C13754dXa.TaskDescription.resume;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return dTV.isConnected;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC16921esz> c43312rms, @NotNull final C17227eyn c17227eyn) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c17227eyn, "");
            super.onBindViewHolder((C43312rms) c43312rms, c17227eyn);
            ((AbstractC16921esz) c43312rms.OLrzqt()).OLrzqt.setText(c17227eyn.copydefault());
            ((AbstractC16921esz) c43312rms.OLrzqt()).AEQbTJ.setText(c17227eyn.OLrzqt());
            android.view.View view = c43312rms.itemView;
            final ActivityC17216eyc activityC17216eyc = ActivityC17216eyc.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.eyp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    ActivityC17216eyc.StateListAnimator.OLrzqt(c17227eyn, activityC17216eyc, view2);
                }
            });
        }

        public static final void OLrzqt(C17227eyn c17227eyn, ActivityC17216eyc activityC17216eyc, android.view.View view) {
            switch (Application.EZpvd[c17227eyn.EZpvd().ordinal()]) {
                case 1:
                    activityC17216eyc.copydefault();
                    return;
                case 2:
                    ActivityC17135exA.Companion.copydefault(activityC17216eyc);
                    return;
                case 3:
                    activityC17216eyc.AEQbTJ();
                    return;
                case 4:
                    ActivityC17154exT.Companion.AEQbTJ(activityC17216eyc);
                    return;
                case 5:
                    ActivityC17144exJ.Companion.copydefault(activityC17216eyc);
                    return;
                case 6:
                    eVN evn = eVN.AEQbTJ;
                    boolean z = !evn.KWHzl();
                    evn.copydefault(z);
                    C55328xhq.show$default(C55328xhq.OLrzqt, "showWeb3: " + z, (android.graphics.drawable.Drawable) null, 1, (java.lang.Integer) null, 0, 0, 58, (java.lang.Object) null);
                    return;
                case 7:
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC17216eyc), null, null, new WalletDebugListActivity$ItemWalletDebugTemplate$onBindViewHolder$1$1(null), 3, null);
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void AEQbTJ() {
        java.lang.String absolutePath = getCacheDir().getAbsolutePath();
        java.lang.String str = java.io.File.separator;
        final java.io.File file = new java.io.File(absolutePath + str + "backupCache" + str + "cloudBackupFile_" + java.lang.System.currentTimeMillis() + ".txt");
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            java.io.File parentFile = file.getParentFile();
            Intrinsics.copydefault(parentFile);
            parentFile.mkdirs();
        }
        if (file.exists()) {
            file.delete();
        }
        new C14396dkf().AEQbTJ(this, new Function1() { // from class: o.eyj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17216eyc.EZpvd(file, this, (java.util.List) obj);
            }
        });
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final Unit EZpvd(java.io.File file, ActivityC17216eyc activityC17216eyc, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            C55326xho.toastWithFailedIcon$default("backup List is empty", 0, 1, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            HDWalletCloudBackupBean hDWalletCloudBackupBean = (HDWalletCloudBackupBean) it.next();
            hDWalletCloudBackupBean.setPasswordHash("");
            HDWalletBackupTypeBean backupTypeBean = hDWalletCloudBackupBean.getBackupTypeBean();
            if (backupTypeBean != null) {
                backupTypeBean.setEncryptData("");
            }
        }
        java.lang.String json = new Gson().toJson(list);
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            Intrinsics.copydefault((java.lang.Object) json);
            byte[] bytes = json.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            Unit unit = Unit.INSTANCE;
            yFA.copydefault(fileOutputStream, null);
            activityC17216eyc.AEQbTJ(file, true);
            return unit;
        } finally {
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
