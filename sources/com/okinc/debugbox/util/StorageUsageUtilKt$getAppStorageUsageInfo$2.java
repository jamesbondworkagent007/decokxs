package com.okinc.debugbox.util;

import android.content.Context;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import o.C33056mpJ;
import o.C34703nhO;
import o.C56391yDq;
import o.C56442yFn;
import o.mOD;
import o.yFA;

/* JADX INFO: loaded from: classes18.dex */
public final class StorageUsageUtilKt$getAppStorageUsageInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
    final /* synthetic */ Context $context;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageUsageUtilKt$getAppStorageUsageInfo$2(Context context, Continuation<? super StorageUsageUtilKt$getAppStorageUsageInfo$2> continuation) {
        super(2, continuation);
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StorageUsageUtilKt$getAppStorageUsageInfo$2(this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
        return ((StorageUsageUtilKt$getAppStorageUsageInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        File parentFile;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            File file = new File(this.$context.getFilesDir(), "storage_analysis_log.txt");
            Context context = this.$context;
            file.deleteOnExit();
            if (C33056mpJ.AEQbTJ(file)) {
                Writer outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), Charsets.UTF_8);
                BufferedWriter bufferedWriter = outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
                try {
                    bufferedWriter.append((CharSequence) context.getApplicationInfo().name).append('\n');
                    bufferedWriter.append((CharSequence) (context.getPackageName() + " --- " + C34703nhO.valueOf(context))).append('\n');
                    long j = (long) 1024;
                    bufferedWriter.append((CharSequence) ("Disk total Space: " + ((mOD.OLrzqt() / j) / j) + "MB, available space: " + ((mOD.EZpvd() / j) / j) + "MB")).append('\n');
                    bufferedWriter.append((CharSequence) "---------------------------------").append('\n');
                    bufferedWriter.append('\n');
                    File dataDir = context.getDataDir();
                    bufferedWriter.append((CharSequence) "Internal data dir: ").append('\n');
                    Intrinsics.copydefault(dataDir);
                    long jEZpvd = mOD.EZpvd(dataDir, bufferedWriter);
                    bufferedWriter.append('\n');
                    File externalFilesDir = context.getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        bufferedWriter.append((CharSequence) "External file dir: ").append('\n');
                        jEZpvd += mOD.EZpvd(externalFilesDir, bufferedWriter);
                    }
                    bufferedWriter.append('\n');
                    File externalCacheDir = context.getExternalCacheDir();
                    if (externalCacheDir != null) {
                        bufferedWriter.append((CharSequence) "External cache dir: ").append('\n');
                        jEZpvd += mOD.EZpvd(externalCacheDir, bufferedWriter);
                    }
                    bufferedWriter.append('\n');
                    bufferedWriter.append((CharSequence) ("Application data size: " + jEZpvd + " bytes")).append('\n');
                    bufferedWriter.append('\n');
                    String str = context.getApplicationInfo().sourceDir;
                    if (str != null && (parentFile = new File(str).getParentFile()) != null) {
                        long jEZpvd2 = mOD.EZpvd(parentFile, null);
                        jEZpvd += jEZpvd2;
                        bufferedWriter.append((CharSequence) ("Application source size: " + jEZpvd2 + " bytes")).append('\n');
                    }
                    bufferedWriter.append('\n');
                    bufferedWriter.append((CharSequence) ("Application total size: " + jEZpvd + " bytes")).append('\n');
                    Unit unit = Unit.INSTANCE;
                    yFA.copydefault(bufferedWriter, null);
                } finally {
                }
            }
            return file;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
