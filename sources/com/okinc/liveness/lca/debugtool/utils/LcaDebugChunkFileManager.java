package com.okinc.liveness.lca.debugtool.utils;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import o.C59449zhJ;
import o.pUU;
import o.yDY;
import o.yET;
import o.yFA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaDebugChunkFileManager {
    public static final String CHUNK_DIR = "video_chunks";
    public static final String CHUNK_PREFIX = "segment_";
    public static int chunkIndex;
    public static final LcaDebugChunkFileManager INSTANCE = new LcaDebugChunkFileManager();
    public static final int $stable = 8;

    private LcaDebugChunkFileManager() {
    }

    public final File getChunkDir(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        File file = new File(context.getExternalFilesDir(null), CHUNK_DIR);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final void clearChunks(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        pUU.EZpvd("ChunkSave", "clearChunks");
        chunkIndex = 0;
        File[] fileArrListFiles = getChunkDir(context).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }
    }

    public final List<File> getAllChunks(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        File[] fileArrListFiles = getChunkDir(context).listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                if (C59449zhJ.startsWith$default(name, CHUNK_PREFIX, false, 2, null)) {
                    arrayList.add(file);
                }
            }
            List<File> listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new Comparator() { // from class: com.okinc.liveness.lca.debugtool.utils.LcaDebugChunkFileManager$getAllChunks$$inlined$sortedBy$1
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return yET.KWHzl(((File) t).getName(), ((File) t2).getName());
                }
            });
            if (listEZpvd != null) {
                return listEZpvd;
            }
        }
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void saveChunkToFile(@NotNull Context context, @NotNull byte[] bArr, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        try {
            pUU.EZpvd("ChunkSave", "Original chunk: " + bArr + ", size: " + bArr.length + ", timestamp: " + j);
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            Locale locale = Locale.US;
            int i = chunkIndex;
            chunkIndex = i + 1;
            String str = String.format(locale, "%05d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            File file = new File(getChunkDir(context), CHUNK_PREFIX + str + "_" + j + ".mp4");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                Unit unit = Unit.INSTANCE;
                yFA.copydefault(fileOutputStream, null);
                pUU.EZpvd("ChunkSave", "Saved chunk: " + file.getName() + ", size: " + bArr.length);
            } finally {
            }
        } catch (Exception e) {
            pUU.copydefault("ChunkSave", "Error saving chunk: " + e.getMessage());
        }
    }
}
