package com.okinc.liveness.lca.debugtool.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.liveness.lca.debugtool.utils.LcaDebugChunkFileManager;
import com.okinc.liveness.lca.utils.LcaMediaUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C34717nhc;
import o.C45695sur;
import o.C55328xhq;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.yDY;
import o.yFA;
import o.yFB;
import okhttp3.MediaType;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaDebugChunkListActivity extends AppCompatActivity {
    public static final int $stable = 8;
    public C45695sur binding;
    public LcaSampleChunkAdapter chunkAdapter;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C45695sur c45695surOLrzqt = C45695sur.OLrzqt(getLayoutInflater());
        this.binding = c45695surOLrzqt;
        if (c45695surOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c45695surOLrzqt = null;
        }
        setContentView(c45695surOLrzqt.getRoot());
        copydefault();
        setupMergeButton();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C34717nhc.Companion.copydefault(this);
    }

    private final void copydefault() {
        C45695sur c45695sur = this.binding;
        LcaSampleChunkAdapter lcaSampleChunkAdapter = null;
        if (c45695sur == null) {
            Intrinsics.gEmmrt("");
            c45695sur = null;
        }
        c45695sur.KWHzl.setLayoutManager(new LinearLayoutManager(this));
        this.chunkAdapter = new LcaSampleChunkAdapter(yDY.AhwBna(), new Function1() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugChunkListActivity$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LcaDebugChunkListActivity.setupRecyclerView$lambda$0(this.f$0, (File) obj);
            }
        });
        C45695sur c45695sur2 = this.binding;
        if (c45695sur2 == null) {
            Intrinsics.gEmmrt("");
            c45695sur2 = null;
        }
        RecyclerView recyclerView = c45695sur2.KWHzl;
        LcaSampleChunkAdapter lcaSampleChunkAdapter2 = this.chunkAdapter;
        if (lcaSampleChunkAdapter2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            lcaSampleChunkAdapter = lcaSampleChunkAdapter2;
        }
        recyclerView.setAdapter(lcaSampleChunkAdapter);
        updateChunkList();
    }

    public static final Unit setupRecyclerView$lambda$0(LcaDebugChunkListActivity lcaDebugChunkListActivity, File file) {
        Intrinsics.checkNotNullParameter(file, "");
        lcaDebugChunkListActivity.playVideo(file);
        return Unit.INSTANCE;
    }

    public final void updateChunkList() {
        List<File> allChunks = LcaDebugChunkFileManager.INSTANCE.getAllChunks(this);
        LcaSampleChunkAdapter lcaSampleChunkAdapter = this.chunkAdapter;
        if (lcaSampleChunkAdapter == null) {
            Intrinsics.gEmmrt("");
            lcaSampleChunkAdapter = null;
        }
        lcaSampleChunkAdapter.updateChunks(allChunks);
    }

    public final void setupMergeButton() {
        C45695sur c45695sur = this.binding;
        if (c45695sur == null) {
            Intrinsics.gEmmrt("");
            c45695sur = null;
        }
        c45695sur.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.liveness.lca.debugtool.ui.LcaDebugChunkListActivity$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.compressChunks();
            }
        });
    }

    public final void compressChunks() {
        List<File> allChunks = LcaDebugChunkFileManager.INSTANCE.getAllChunks(this);
        if (allChunks.isEmpty()) {
            C55328xhq.show$default(C55328xhq.OLrzqt, "No segments to compress", (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null).show();
            return;
        }
        String str = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new AnonymousClass1(new File(getExternalFilesDir(null), "video_segments_" + str + ".zip"), allChunks, this, null), 2, null);
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.debugtool.ui.LcaDebugChunkListActivity$compressChunks$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<File> $chunks;
        final /* synthetic */ File $zipFile;
        int label;
        final /* synthetic */ LcaDebugChunkListActivity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.io.File> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(File file, List<? extends File> list, LcaDebugChunkListActivity lcaDebugChunkListActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$zipFile = file;
            this.$chunks = list;
            this.this$0 = lcaDebugChunkListActivity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$zipFile, this.$chunks, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                } else {
                    C56391yDq.AEQbTJ(obj);
                    OutputStream fileOutputStream = new FileOutputStream(this.$zipFile);
                    ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream instanceof BufferedOutputStream ? (BufferedOutputStream) fileOutputStream : new BufferedOutputStream(fileOutputStream, 8192));
                    try {
                        for (File file : this.$chunks) {
                            zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                            yFB.copyTo$default(new FileInputStream(file), zipOutputStream, 0, 2, null);
                            zipOutputStream.closeEntry();
                        }
                        Unit unit = Unit.INSTANCE;
                        yFA.copydefault(zipOutputStream, null);
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$zipFile, null);
                        this.label = 1;
                        if (BuildersKt.withContext(main, anonymousClass2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } finally {
                    }
                }
            } catch (Exception e) {
                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(e, null);
                this.label = 2;
                if (BuildersKt.withContext(main2, anonymousClass3, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.liveness.lca.debugtool.ui.LcaDebugChunkListActivity$compressChunks$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ File $zipFile;
            int label;
            final /* synthetic */ LcaDebugChunkListActivity this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LcaDebugChunkListActivity lcaDebugChunkListActivity, File file, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = lcaDebugChunkListActivity;
                this.$zipFile = file;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$zipFile, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    this.this$0.shareZipFile(this.$zipFile);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.liveness.lca.debugtool.ui.LcaDebugChunkListActivity$compressChunks$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Exception $e;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(Exception exc, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$e = exc;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$e, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C55328xhq.show$default(C55328xhq.OLrzqt, "Compression failed: " + this.$e.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null).show();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void shareZipFile(File file) {
        Uri uriForFile = FileProvider.getUriForFile(this, getPackageName() + ".provider", file);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("application/zip");
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        intent.addFlags(1);
        startActivity(Intent.createChooser(intent, "Share compressed segments"));
    }

    public final void playVideo(File file) {
        try {
            pUU.EZpvd("VideoPlay", "Starting to play file: " + file.getAbsolutePath());
            pUU.EZpvd("VideoPlay", "File exists: " + file.exists());
            pUU.EZpvd("VideoPlay", "File size: " + file.length());
            pUU.EZpvd("VideoPlay", "File readable: " + file.canRead());
            if (file.exists() && file.canRead()) {
                MediaType mediaTypeFromFile = LcaMediaUtils.INSTANCE.getMediaTypeFromFile(file);
                pUU.EZpvd("VideoPlay", "MIME type: " + mediaTypeFromFile);
                Uri uriForFile = FileProvider.getUriForFile(this, getPackageName() + ".provider", file);
                pUU.EZpvd("VideoPlay", "Video URI: " + uriForFile);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(uriForFile, String.valueOf(mediaTypeFromFile));
                intent.addFlags(1);
                intent.addFlags(268435456);
                List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(intent, 0);
                Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
                if (!(!listQueryIntentActivities.isEmpty())) {
                    C55328xhq.show$default(C55328xhq.OLrzqt, "没有找到支持的视频播放器", (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null).show();
                    return;
                }
                Iterator<T> it = listQueryIntentActivities.iterator();
                while (it.hasNext()) {
                    grantUriPermission(((ResolveInfo) it.next()).activityInfo.packageName, uriForFile, 1);
                }
                startActivity(Intent.createChooser(intent, "选择播放器"));
                return;
            }
            C55328xhq.show$default(C55328xhq.OLrzqt, "文件不存在或无法访问", (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null).show();
        } catch (Exception e) {
            pUU.AEQbTJ("VideoPlay", "Error playing video: " + e.getMessage(), e);
            C55328xhq.show$default(C55328xhq.OLrzqt, "播放失败: " + e.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null).show();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
