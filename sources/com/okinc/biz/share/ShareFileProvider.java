package com.okinc.biz.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import androidx.core.content.FileProvider;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.biz.share.ShareFileProvider;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.C32979mnm;
import o.C33024moe;
import o.C33487mxQ;
import o.C43246rlf;
import o.C56392yDr;
import o.C58156yvv;
import o.InterfaceC56387yDm;
import o.InterfaceC58229yxO;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ShareFileProvider {
    public static final int $stable = 0;
    public static final String CROP_FOLDR_NAME = "crop";
    public static final String SHARE_FOLDR_NAME = "share";
    public static final StateListAnimator Companion = new StateListAnimator(null);
    private static final InterfaceC56387yDm<String> AUTHORITY$delegate = C56392yDr.copydefault(new Function0() { // from class: o.aXD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ShareFileProvider.AUTHORITY_delegate$lambda$0();
        }
    });

    /* JADX INFO: loaded from: classes14.dex */
    public interface TaskDescription {
        void OLrzqt(File file);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.biz.share.ShareFileProvider.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final String EZpvd() {
            return (String) ShareFileProvider.AUTHORITY$delegate.getValue();
        }

        public final File AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new File(copydefault(), str);
        }

        public final File copydefault() {
            File file = new File(KWHzl(), "share");
            if (!file.exists()) {
                file.mkdirs();
            }
            return file;
        }

        public final File KWHzl() {
            C32979mnm c32979mnm = C32979mnm.EZpvd;
            File externalCacheDir = c32979mnm.OLrzqt().getExternalCacheDir();
            if (externalCacheDir == null || !Intrinsics.EZpvd((Object) Environment.getExternalStorageState(), (Object) "mounted")) {
                externalCacheDir = c32979mnm.OLrzqt().getCacheDir();
            }
            Intrinsics.copydefault(externalCacheDir);
            return externalCacheDir;
        }

        public final File AEQbTJ(@NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            boolean z = bitmap.getConfig() == Bitmap.Config.RGB_565;
            File fileAEQbTJ = AEQbTJ(System.currentTimeMillis() + (z ? ".jpg" : ".png"));
            if (C33487mxQ.OLrzqt(bitmap, fileAEQbTJ)) {
                return fileAEQbTJ;
            }
            return null;
        }

        public static final Unit KWHzl(Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.biz.share.ShareFileProvider$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void savePendingShareBitmap$default(StateListAnimator stateListAnimator, Bitmap bitmap, LifecycleOwner lifecycleOwner, Function1 function1, Function1 function12, int i, Object obj) {
            if ((i & 4) != 0) {
                function1 = new Function1() { // from class: o.aXJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ShareFileProvider.StateListAnimator.KWHzl((java.lang.Throwable) obj2);
                    }
                };
            }
            stateListAnimator.copydefault(bitmap, lifecycleOwner, function1, function12);
        }

        public final void copydefault(@NotNull Bitmap bitmap, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function1<? super File, Unit> function12) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            C33024moe.subscribeOnComputation$default(C58156yvv.EZpvd(KWHzl(bitmap), lifecycleOwner), function1, (Function0) null, function12, 2, (Object) null);
        }

        public final void copydefault(@NotNull Bitmap bitmap, @NotNull LifecycleOwner lifecycleOwner, @NotNull final TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            Intrinsics.checkNotNullParameter(lifecycleOwner, "");
            Intrinsics.checkNotNullParameter(taskDescription, "");
            copydefault(bitmap, lifecycleOwner, new Function1() { // from class: o.aXH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ShareFileProvider.StateListAnimator.AEQbTJ(taskDescription, (java.lang.Throwable) obj);
                }
            }, new Function1() { // from class: o.aXK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ShareFileProvider.StateListAnimator.OLrzqt(taskDescription, (java.io.File) obj);
                }
            });
        }

        public static final Unit AEQbTJ(TaskDescription taskDescription, Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            pUU.copydefault("ShareFileProvider", "savePendingShareBitmap error:" + th.getMessage());
            taskDescription.OLrzqt(null);
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(TaskDescription taskDescription, File file) {
            Intrinsics.checkNotNullParameter(file, "");
            taskDescription.OLrzqt(file);
            return Unit.INSTANCE;
        }

        public final AbstractC58185ywX<File> KWHzl(@NotNull Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(bitmap);
            final Function1 function1 = new Function1() { // from class: o.aXI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ShareFileProvider.StateListAnimator.copydefault((android.graphics.Bitmap) obj);
                }
            };
            AbstractC58185ywX<File> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.aXL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ShareFileProvider.StateListAnimator.EZpvd(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
            return abstractC58185ywXAEQbTJ;
        }

        public static final File EZpvd(Function1 function1, Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (File) function1.invoke(obj);
        }

        public static final File copydefault(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "");
            return ShareFileProvider.Companion.AEQbTJ(bitmap);
        }

        public final Uri copydefault(@NotNull Context context, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Uri uriForFile = FileProvider.getUriForFile(context, EZpvd(), new File(str));
            Intrinsics.copydefault(uriForFile);
            return uriForFile;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AUTHORITY_delegate$lambda$0() {
        return C43246rlf.OLrzqt.valueOf().getPackageName() + ".share.fileProvider";
    }
}
