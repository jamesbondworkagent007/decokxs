package com.okinc.web3.security.features.backup.privatekey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.web3.security.BR;
import com.okinc.web3.security.databinding.ActivityBackupPrivateKeyBinding;
import com.okinc.web3.security.model.PrivateKeyInfo;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import com.okinc.web3.security.utils.LruCacheBitmapUtils;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractActivityC33013moT;
import o.C32866mlf;
import o.C33537myN;
import o.C43316rmw;
import o.C56392yDr;
import o.C57407yho;
import o.InterfaceC35204nqs;
import o.InterfaceC56387yDm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class BackupPrivateKeyActivity extends AbstractActivityC33013moT implements InterfaceC35204nqs {
    private static final String EXTRA_PASSWORD = "password";
    private static final String EXTRA_PRIVATE_KEY_INFOS = "privateKeyInfos";
    private static final String EXTRA_TITLE = "title";
    private ActivityBackupPrivateKeyBinding mDataBinding;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private final InterfaceC56387yDm mAdapter$delegate = C56392yDr.copydefault(new Function0() { // from class: com.okinc.web3.security.features.backup.privatekey.BackupPrivateKeyActivity$$ExternalSyntheticLambda0
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BackupPrivateKeyActivity.mAdapter_delegate$lambda$0();
        }
    });
    private final LruCacheBitmapUtils drawableCacheUtils = new LruCacheBitmapUtils();

    @Override // o.AbstractActivityC33041mov, o.InterfaceC48850udU
    public boolean canScreenshot() {
        return false;
    }

    public void checkEnv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C43316rmw getMAdapter() {
        return (C43316rmw) this.mAdapter$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw mAdapter_delegate$lambda$0() {
        return new C43316rmw();
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.features.backup.privatekey.BackupPrivateKeyActivity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void startActivity(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @NotNull ArrayList<PrivateKeyInfo> arrayList) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intent intent = new Intent(activity, (Class<?>) BackupPrivateKeyActivity.class);
            intent.putExtra("title", str);
            intent.putExtra("password", str2);
            intent.putParcelableArrayListExtra(BackupPrivateKeyActivity.EXTRA_PRIVATE_KEY_INFOS, arrayList);
            activity.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mDataBinding = (ActivityBackupPrivateKeyBinding) DataBindingUtil.setContentView(this, C57407yho.StateListAnimator.KWHzl);
        ActivityBackupPrivateKeyBinding activityBackupPrivateKeyBinding = null;
        C32866mlf.onEvent$default(Web3SecurityTrackEvent.Web3WalletManagement_EditAccount_PrivateKey_View, (TrackChannel[]) null, (Function1) null, 3, (Object) null);
        ActivityBackupPrivateKeyBinding activityBackupPrivateKeyBinding2 = this.mDataBinding;
        if (activityBackupPrivateKeyBinding2 == null) {
            Intrinsics.gEmmrt("");
            activityBackupPrivateKeyBinding2 = null;
        }
        C33537myN c33537myN = activityBackupPrivateKeyBinding2.appBar;
        String stringExtra = getIntent().getStringExtra("title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        c33537myN.setAppBarTitle(stringExtra);
        ActivityBackupPrivateKeyBinding activityBackupPrivateKeyBinding3 = this.mDataBinding;
        if (activityBackupPrivateKeyBinding3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            activityBackupPrivateKeyBinding = activityBackupPrivateKeyBinding3;
        }
        RecyclerView recyclerView = activityBackupPrivateKeyBinding.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        getMAdapter().register(PrivateKeyInfo.class, new BackupPrivateKeyActivity$onCreate$2$1(this, C57407yho.StateListAnimator.AkhnZx, BR.privateKeyInfo));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra(EXTRA_PRIVATE_KEY_INFOS);
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new ArrayList();
        }
        getMAdapter().setItems(parcelableArrayListExtra);
        recyclerView.setAdapter(getMAdapter());
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
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
