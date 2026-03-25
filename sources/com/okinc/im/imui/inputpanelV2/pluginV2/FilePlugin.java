package com.okinc.im.imui.inputpanelV2.pluginV2;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.im.config.serviceprovider.GeneralAction;
import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.im.imui.inputpanelV2.pluginV2.FilePlugin;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC35291nsZ;
import o.AbstractC37674oyL;
import o.C33069mpW;
import o.C33070mpX;
import o.C35287nsV;
import o.C35399nuc;
import o.C37668oyF;
import o.C37676oyN;
import o.C44161sFo;
import o.C55284xgz;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.InterfaceC35289nsX;
import o.pUU;
import o.sFB;
import o.sSI;
import o.yCM;
import o.yDV;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class FilePlugin extends AbstractC35291nsZ implements DefaultLifecycleObserver {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher AYXKKw;
    public final C37676oyN EZpvd;
    public ActivityResultLauncher<String[]> KWHzl;
    public WeakReference<Fragment> djBIcL;
    public boolean gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35288nsW
    public void OLrzqt(int i, int i2, Intent intent, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35288nsW
    public void OLrzqt(@NotNull Fragment fragment, int i, @NotNull String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
    }

    @yCM
    public FilePlugin(@NotNull C37676oyN c37676oyN, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c37676oyN, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c37676oyN;
        this.AYXKKw = coroutineDispatcher;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.inputpanelV2.pluginV2.FilePlugin.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.InterfaceC35288nsW
    public Drawable EZpvd(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33070mpX.KWHzl(C35399nuc.ActionBar.gHZMYf);
    }

    @Override // o.InterfaceC35288nsW
    public String KWHzl() {
        return C33070mpX.AYXKKw(C35399nuc.LoaderManager.QhsCdEQhsCdE);
    }

    @Override // o.InterfaceC35288nsW
    public void copydefault(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        pUU.KWHzl("FilePlugin", "File plugin clicked");
        AEQbTJ(fragment);
        valueOf();
    }

    public final void AEQbTJ(final Fragment fragment) {
        WeakReference<Fragment> weakReference = this.djBIcL;
        Fragment fragment2 = weakReference != null ? weakReference.get() : null;
        if (this.KWHzl == null || fragment2 != fragment) {
            OLrzqt();
            this.djBIcL = new WeakReference<>(fragment);
            if (!this.gEmmrt) {
                fragment.getViewLifecycleOwner().getLifecycle().addObserver(this);
                this.gEmmrt = true;
            }
            String str = "file_plugin_document_picker_" + hashCode();
            this.KWHzl = fragment.requireActivity().getActivityResultRegistry().register(str, new ActivityResultContracts.OpenDocument(), new ActivityResultCallback() { // from class: o.obh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) {
                    FilePlugin.OLrzqt(fragment, this, (android.net.Uri) obj);
                }
            });
            pUU.EZpvd("FilePlugin", "Document picker launcher registered with key: " + str);
        }
    }

    public static final void OLrzqt(Fragment fragment, FilePlugin filePlugin, Uri uri) {
        if (uri == null) {
            pUU.KWHzl("FilePlugin", "Document picker cancelled");
            return;
        }
        pUU.KWHzl("FilePlugin", "Document selected: " + uri);
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new FilePlugin$ensureLauncherRegistered$1$1(filePlugin, fragment, uri, null), 3, null);
    }

    public final void OLrzqt() {
        ActivityResultLauncher<String[]> activityResultLauncher = this.KWHzl;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        this.KWHzl = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        pUU.EZpvd("FilePlugin", "Cleaning up document picker launcher");
        OLrzqt();
        this.gEmmrt = false;
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    public final void valueOf() {
        ActivityResultLauncher<String[]> activityResultLauncher = this.KWHzl;
        if (activityResultLauncher == null) {
            pUU.copydefault("FilePlugin", "Document picker launcher not registered");
            return;
        }
        boolean zCopydefault = sSI.copydefault.copydefault();
        String[] strArrAEQbTJ = this.EZpvd.AEQbTJ(zCopydefault);
        pUU.KWHzl("FilePlugin", "Launching document picker (isInternal=" + zCopydefault + ", types=" + yDV.AwvSrB(strArrAEQbTJ) + ")");
        try {
            activityResultLauncher.launch(strArrAEQbTJ);
        } catch (Exception e) {
            pUU.AEQbTJ("FilePlugin", "Failed to launch document picker", e);
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Activity {
        public final String AEQbTJ;
        public final Uri AhwBna;
        public final String EZpvd;
        public final C37668oyF KWHzl;
        public final byte[] OLrzqt;
        public final long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, Uri uri, String str, long j, String str2, C37668oyF c37668oyF, byte[] bArr, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = activity.AhwBna;
            }
            if ((i & 2) != 0) {
                str = activity.AEQbTJ;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                j = activity.copydefault;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                str2 = activity.EZpvd;
            }
            String str4 = str2;
            if ((i & 16) != 0) {
                c37668oyF = activity.KWHzl;
            }
            C37668oyF c37668oyF2 = c37668oyF;
            if ((i & 32) != 0) {
                bArr = activity.OLrzqt;
            }
            return activity.OLrzqt(uri, str3, j2, str4, c37668oyF2, bArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C37668oyF AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte[] EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull Uri uri, @NotNull String str, long j, @NotNull String str2, @NotNull C37668oyF c37668oyF, byte[] bArr) {
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(c37668oyF, "");
            return new Activity(uri, str, j, str2, c37668oyF, bArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.AhwBna, activity.AhwBna) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) activity.AEQbTJ) && this.copydefault == activity.copydefault && Intrinsics.EZpvd((Object) this.EZpvd, (Object) activity.EZpvd) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AhwBna.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            int iHashCode3 = Long.hashCode(this.copydefault);
            int iHashCode4 = this.EZpvd.hashCode();
            int iHashCode5 = this.KWHzl.hashCode();
            byte[] bArr = this.OLrzqt;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bArr == null ? 0 : Arrays.hashCode(bArr));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FileMetadata(uri=" + this.AhwBna + ", fileName=" + this.AEQbTJ + ", fileSize=" + this.copydefault + ", mimeType=" + this.EZpvd + ", config=" + this.KWHzl + ", fileHeader=" + Arrays.toString(this.OLrzqt) + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Uri valueOf() {
            return this.AhwBna;
        }

        public Activity(@NotNull Uri uri, @NotNull String str, long j, @NotNull String str2, @NotNull C37668oyF c37668oyF, byte[] bArr) {
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(c37668oyF, "");
            this.AhwBna = uri;
            this.AEQbTJ = str;
            this.copydefault = j;
            this.EZpvd = str2;
            this.KWHzl = c37668oyF;
            this.OLrzqt = bArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(Context context, Uri uri, Continuation<? super Unit> continuation) throws Throwable {
        FilePlugin$processSelectedFile$1 filePlugin$processSelectedFile$1;
        FilePlugin filePlugin;
        Uri uri2;
        String str;
        String str2;
        long j;
        C37668oyF c37668oyF;
        Context context2;
        Activity activity;
        AbstractC37674oyL abstractC37674oyLCopydefault;
        Context context3 = context;
        Uri uri3 = uri;
        if (continuation instanceof FilePlugin$processSelectedFile$1) {
            filePlugin$processSelectedFile$1 = (FilePlugin$processSelectedFile$1) continuation;
            int i = filePlugin$processSelectedFile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                filePlugin$processSelectedFile$1.label = i - Integer.MIN_VALUE;
            } else {
                filePlugin$processSelectedFile$1 = new FilePlugin$processSelectedFile$1(this, continuation);
            }
        }
        Object objGEmmrt = filePlugin$processSelectedFile$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = filePlugin$processSelectedFile$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objGEmmrt);
            filePlugin$processSelectedFile$1.L$0 = this;
            filePlugin$processSelectedFile$1.L$1 = context3;
            filePlugin$processSelectedFile$1.L$2 = uri3;
            filePlugin$processSelectedFile$1.label = 1;
            objGEmmrt = sFB.gEmmrt(uri3, context3, filePlugin$processSelectedFile$1);
            if (objGEmmrt == objCopydefault) {
                return objCopydefault;
            }
            filePlugin = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objGEmmrt);
                    return Unit.INSTANCE;
                }
                long j2 = filePlugin$processSelectedFile$1.J$0;
                C37668oyF c37668oyF2 = (C37668oyF) filePlugin$processSelectedFile$1.L$5;
                String str3 = (String) filePlugin$processSelectedFile$1.L$4;
                String str4 = (String) filePlugin$processSelectedFile$1.L$3;
                Uri uri4 = (Uri) filePlugin$processSelectedFile$1.L$2;
                context2 = (Context) filePlugin$processSelectedFile$1.L$1;
                filePlugin = (FilePlugin) filePlugin$processSelectedFile$1.L$0;
                C56391yDq.AEQbTJ(objGEmmrt);
                j = j2;
                c37668oyF = c37668oyF2;
                str = str3;
                str2 = str4;
                uri2 = uri4;
                activity = new Activity(uri2, str2, j, str, c37668oyF, (byte[]) objGEmmrt);
                abstractC37674oyLCopydefault = filePlugin.copydefault(activity);
                filePlugin$processSelectedFile$1.L$0 = null;
                filePlugin$processSelectedFile$1.L$1 = null;
                filePlugin$processSelectedFile$1.L$2 = null;
                filePlugin$processSelectedFile$1.L$3 = null;
                filePlugin$processSelectedFile$1.L$4 = null;
                filePlugin$processSelectedFile$1.L$5 = null;
                filePlugin$processSelectedFile$1.label = 3;
                if (filePlugin.KWHzl(context2, activity, abstractC37674oyLCopydefault, filePlugin$processSelectedFile$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            Uri uri5 = (Uri) filePlugin$processSelectedFile$1.L$2;
            Context context4 = (Context) filePlugin$processSelectedFile$1.L$1;
            FilePlugin filePlugin2 = (FilePlugin) filePlugin$processSelectedFile$1.L$0;
            C56391yDq.AEQbTJ(objGEmmrt);
            filePlugin = filePlugin2;
            uri3 = uri5;
            context3 = context4;
        }
        C44161sFo c44161sFo = (C44161sFo) objGEmmrt;
        String strCopydefault = c44161sFo.copydefault();
        long jKWHzl = c44161sFo.KWHzl();
        String strOLrzqt = c44161sFo.OLrzqt();
        if (strOLrzqt == null) {
            pUU.copydefault("FilePlugin", "Could not retrieve MIME type for file: " + strCopydefault);
            filePlugin.EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.gGNlxh));
            return Unit.INSTANCE;
        }
        boolean zCopydefault = sSI.copydefault.copydefault();
        C37668oyF c37668oyFKWHzl = filePlugin.EZpvd.KWHzl(strOLrzqt);
        if (c37668oyFKWHzl == null || !filePlugin.EZpvd.EZpvd(strOLrzqt, zCopydefault)) {
            pUU.valueOf("FilePlugin", "File type " + strOLrzqt + " not supported or not allowed (isInternal=" + zCopydefault + ")");
            filePlugin.EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.gGNlxh));
            return Unit.INSTANCE;
        }
        pUU.KWHzl("FilePlugin", "Processing file: name=" + strCopydefault + ", size=" + jKWHzl + ", mimeType=" + strOLrzqt);
        CoroutineDispatcher coroutineDispatcher = filePlugin.AYXKKw;
        FilePlugin$processSelectedFile$fileHeader$1 filePlugin$processSelectedFile$fileHeader$1 = new FilePlugin$processSelectedFile$fileHeader$1(filePlugin, context3, uri3, null);
        filePlugin$processSelectedFile$1.L$0 = filePlugin;
        filePlugin$processSelectedFile$1.L$1 = context3;
        filePlugin$processSelectedFile$1.L$2 = uri3;
        filePlugin$processSelectedFile$1.L$3 = strCopydefault;
        filePlugin$processSelectedFile$1.L$4 = strOLrzqt;
        filePlugin$processSelectedFile$1.L$5 = c37668oyFKWHzl;
        filePlugin$processSelectedFile$1.J$0 = jKWHzl;
        filePlugin$processSelectedFile$1.label = 2;
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, filePlugin$processSelectedFile$fileHeader$1, filePlugin$processSelectedFile$1);
        if (objWithContext == objCopydefault) {
            return objCopydefault;
        }
        uri2 = uri3;
        str = strOLrzqt;
        objGEmmrt = objWithContext;
        str2 = strCopydefault;
        j = jKWHzl;
        c37668oyF = c37668oyFKWHzl;
        context2 = context3;
        activity = new Activity(uri2, str2, j, str, c37668oyF, (byte[]) objGEmmrt);
        abstractC37674oyLCopydefault = filePlugin.copydefault(activity);
        filePlugin$processSelectedFile$1.L$0 = null;
        filePlugin$processSelectedFile$1.L$1 = null;
        filePlugin$processSelectedFile$1.L$2 = null;
        filePlugin$processSelectedFile$1.L$3 = null;
        filePlugin$processSelectedFile$1.L$4 = null;
        filePlugin$processSelectedFile$1.L$5 = null;
        filePlugin$processSelectedFile$1.label = 3;
        if (filePlugin.KWHzl(context2, activity, abstractC37674oyLCopydefault, filePlugin$processSelectedFile$1) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    public final AbstractC37674oyL copydefault(final Activity activity) {
        GroupInfo groupInfoCopydefault;
        GroupInfo groupInfoCopydefault2;
        Integer type;
        OKConversation oKConversationKWHzl;
        final C37668oyF c37668oyFAEQbTJ = activity.AEQbTJ();
        C35287nsV c35287nsVCopydefault = copydefault();
        OfficialTagInfo officialTags = null;
        final OKConversationType conversationType = (c35287nsVCopydefault == null || (oKConversationKWHzl = c35287nsVCopydefault.KWHzl()) == null) ? null : oKConversationKWHzl.getConversationType();
        C35287nsV c35287nsVCopydefault2 = copydefault();
        final GroupTagType groupTagTypeCopydefault = (c35287nsVCopydefault2 == null || (groupInfoCopydefault2 = c35287nsVCopydefault2.copydefault()) == null || (type = groupInfoCopydefault2.getType()) == null) ? null : GroupTagType.Companion.copydefault(Integer.valueOf(type.intValue()));
        C35287nsV c35287nsVCopydefault3 = copydefault();
        if (c35287nsVCopydefault3 != null && (groupInfoCopydefault = c35287nsVCopydefault3.copydefault()) != null) {
            officialTags = groupInfoCopydefault.getOfficialTags();
        }
        final boolean z = officialTags != null;
        Iterator it = yDY.gEmmrt(new Function0() { // from class: o.obc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FilePlugin.EZpvd(this.AEQbTJ, c37668oyFAEQbTJ, conversationType, groupTagTypeCopydefault, z);
            }
        }, new Function0() { // from class: o.obf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FilePlugin.OLrzqt(this.OLrzqt, c37668oyFAEQbTJ, activity);
            }
        }, new Function0() { // from class: o.obg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FilePlugin.copydefault(this.KWHzl, c37668oyFAEQbTJ, activity);
            }
        }, new Function0() { // from class: o.obj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FilePlugin.AYXKKw(this.copydefault, c37668oyFAEQbTJ, activity);
            }
        }).iterator();
        while (it.hasNext()) {
            AbstractC37674oyL abstractC37674oyL = (AbstractC37674oyL) ((Function0) it.next()).invoke();
            if (!(abstractC37674oyL instanceof AbstractC37674oyL.Fragment)) {
                return abstractC37674oyL;
            }
        }
        return AbstractC37674oyL.Fragment.OLrzqt;
    }

    public static final AbstractC37674oyL EZpvd(FilePlugin filePlugin, C37668oyF c37668oyF, OKConversationType oKConversationType, GroupTagType groupTagType, boolean z) {
        return filePlugin.EZpvd.OLrzqt(c37668oyF, oKConversationType, groupTagType, z);
    }

    public static final AbstractC37674oyL OLrzqt(FilePlugin filePlugin, C37668oyF c37668oyF, Activity activity) {
        return filePlugin.EZpvd.OLrzqt(c37668oyF, activity.copydefault());
    }

    public static final AbstractC37674oyL copydefault(FilePlugin filePlugin, C37668oyF c37668oyF, Activity activity) {
        return filePlugin.EZpvd.OLrzqt(c37668oyF, activity.KWHzl());
    }

    public static final AbstractC37674oyL AYXKKw(FilePlugin filePlugin, C37668oyF c37668oyF, Activity activity) {
        return filePlugin.EZpvd.EZpvd(c37668oyF, activity.EZpvd());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Context context, Activity activity, AbstractC37674oyL abstractC37674oyL, Continuation<? super Unit> continuation) throws Throwable {
        FilePlugin$handleValidationResult$1 filePlugin$handleValidationResult$1;
        FilePlugin filePlugin;
        Activity activity2 = activity;
        if (continuation instanceof FilePlugin$handleValidationResult$1) {
            filePlugin$handleValidationResult$1 = (FilePlugin$handleValidationResult$1) continuation;
            int i = filePlugin$handleValidationResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                filePlugin$handleValidationResult$1.label = i - Integer.MIN_VALUE;
            } else {
                filePlugin$handleValidationResult$1 = new FilePlugin$handleValidationResult$1(this, continuation);
            }
        }
        Object objCopydefault = filePlugin$handleValidationResult$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = filePlugin$handleValidationResult$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            if (abstractC37674oyL instanceof AbstractC37674oyL.Fragment) {
                filePlugin$handleValidationResult$1.L$0 = this;
                filePlugin$handleValidationResult$1.L$1 = activity2;
                filePlugin$handleValidationResult$1.label = 1;
                objCopydefault = copydefault(context, activity2, filePlugin$handleValidationResult$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                filePlugin = this;
            } else {
                if (abstractC37674oyL instanceof AbstractC37674oyL.ActionBar) {
                    AbstractC37674oyL.ActionBar actionBar = (AbstractC37674oyL.ActionBar) abstractC37674oyL;
                    pUU.valueOf("FilePlugin", "File size exceeds limit: " + actionBar.AEQbTJ() + "MB > " + actionBar.EZpvd() + "MB");
                    int i3 = C35399nuc.LoaderManager.gBtXYZ;
                    int iEZpvd = actionBar.EZpvd();
                    StringBuilder sb = new StringBuilder();
                    sb.append(iEZpvd);
                    sb.append("MB");
                    EZpvd(C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("fileSize", sb.toString()))));
                } else if (abstractC37674oyL instanceof AbstractC37674oyL.Activity) {
                    pUU.valueOf("FilePlugin", "Invalid file format detected: " + ((AbstractC37674oyL.Activity) abstractC37674oyL).AEQbTJ());
                    EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.gGNlxh));
                } else if (abstractC37674oyL instanceof AbstractC37674oyL.Application) {
                    pUU.valueOf("FilePlugin", "Invalid file extension. Expected: " + ((AbstractC37674oyL.Application) abstractC37674oyL).AEQbTJ());
                    EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.gGNlxh));
                } else if (abstractC37674oyL instanceof AbstractC37674oyL.StateListAnimator) {
                    pUU.valueOf("FilePlugin", "Unsupported file type: " + ((AbstractC37674oyL.StateListAnimator) abstractC37674oyL).EZpvd());
                    EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.gGNlxh));
                } else {
                    if (!(abstractC37674oyL instanceof AbstractC37674oyL.TaskDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pUU.valueOf("FilePlugin", "File not allowed: " + ((AbstractC37674oyL.TaskDescription) abstractC37674oyL).OLrzqt());
                    EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.gGNlxh));
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activity2 = (Activity) filePlugin$handleValidationResult$1.L$1;
            filePlugin = (FilePlugin) filePlugin$handleValidationResult$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        Activity activity3 = activity2;
        Uri uri = (Uri) objCopydefault;
        if (uri == null) {
            pUU.copydefault("FilePlugin", "Failed to cache file locally: " + activity3.KWHzl());
            filePlugin.EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.gGNlxh));
            return Unit.INSTANCE;
        }
        filePlugin.KWHzl(Activity.copy$default(activity3, uri, null, 0L, null, null, null, 62, null));
        return Unit.INSTANCE;
    }

    private final void EZpvd(String str) {
        Fragment fragment;
        C55284xgz c55284xgzKWHzl;
        WeakReference<Fragment> weakReference = this.djBIcL;
        if (weakReference == null || (fragment = weakReference.get()) == null) {
            return;
        }
        View view = fragment.getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (c55284xgzKWHzl = C55284xgz.Companion.KWHzl(viewGroup, str)) == null) {
            return;
        }
        c55284xgzKWHzl.isConnected(0);
        c55284xgzKWHzl.AEQbTJ(str);
        c55284xgzKWHzl.hDKMBd();
    }

    public final Object copydefault(Context context, Activity activity, Continuation<? super Uri> continuation) {
        return BuildersKt.withContext(this.AYXKKw, new FilePlugin$copyToLocalCache$2(context, activity, null), continuation);
    }

    public final void KWHzl(Activity activity) {
        pUU.KWHzl("FilePlugin", "Sending file: " + activity.KWHzl() + " (" + activity.copydefault() + " bytes)");
        String string = activity.valueOf().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        SendMessageRequestParam.File file = new SendMessageRequestParam.File(string, activity.OLrzqt(), activity.KWHzl(), activity.copydefault());
        InterfaceC35289nsX interfaceC35289nsXEZpvd = EZpvd();
        if (interfaceC35289nsXEZpvd != null) {
            interfaceC35289nsXEZpvd.KWHzl(new GeneralAction.SendMessages(yDY.copydefault(file)));
        }
    }
}
