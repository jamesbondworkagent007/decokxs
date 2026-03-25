package o;

import android.media.MediaMetadataRetriever;
import android.provider.MediaStore;
import android.support.v4.media.session.PlaybackStateCompat;
import com.immomo.mls.fun.constants.FileInfo;
import com.okinc.nft.ui.mediapicker.data.bean.MediaInfo;
import com.okinc.nft.ui.mediapicker.data.constants.MediaPickerType;
import com.reown.foundation.util.jwt.JwtUtilsKt;

/* JADX INFO: renamed from: o.rtJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C43648rtJ {

    /* JADX INFO: renamed from: o.rtJ$StateListAnimator */
    public interface StateListAnimator {
        void EZpvd(int i);

        void KWHzl();

        void OLrzqt();

        void OLrzqt(int i, @androidx.annotation.NonNull MediaInfo mediaInfo);
    }

    public static java.lang.String copydefault(android.database.Cursor cursor, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        return columnIndex >= 0 ? cursor.getString(columnIndex) : "";
    }

    public static long OLrzqt(android.database.Cursor cursor, java.lang.String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return cursor.getLong(columnIndex);
        }
        return 0L;
    }

    public static void EZpvd(android.content.Context context, StateListAnimator stateListAnimator) {
        if (context == null || stateListAnimator == null) {
            return;
        }
        stateListAnimator.KWHzl();
        android.database.Cursor cursorQuery = context.getContentResolver().query(MediaStore.Files.getContentUri("external"), new java.lang.String[]{"title", "_display_name", "_data", "date_added", FileInfo.FileSize}, null, null, "date_modified DESC");
        if (cursorQuery == null) {
            return;
        }
        if (cursorQuery.getCount() != 0) {
            stateListAnimator.EZpvd(cursorQuery.getCount());
            int i = 0;
            while (cursorQuery.moveToNext()) {
                java.lang.String strCopydefault = copydefault(cursorQuery, "title");
                java.lang.String strCopydefault2 = copydefault(cursorQuery, "_display_name");
                java.lang.String strCopydefault3 = copydefault(cursorQuery, "_data");
                stateListAnimator.OLrzqt(i, AEQbTJ(strCopydefault, strCopydefault2, MediaPickerType.TYPE_FILE, strCopydefault3, OLrzqt(cursorQuery, "date_added"), OLrzqt(cursorQuery, FileInfo.FileSize), -1L, null, null, EZpvd(strCopydefault3)));
                i++;
            }
        }
        stateListAnimator.OLrzqt();
        cursorQuery.close();
    }

    public static MediaInfo OLrzqt(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull android.net.Uri uri, MediaPickerType mediaPickerType) {
        int iLastIndexOf;
        if (context == null || uri == null) {
            return null;
        }
        android.content.ContentResolver contentResolver = context.getContentResolver();
        MediaInfo.ActionBar actionBar = new MediaInfo.ActionBar();
        actionBar.copydefault(mediaPickerType);
        try {
            android.database.Cursor cursorQuery = contentResolver.query(uri, new java.lang.String[]{"_display_name", "title", FileInfo.FileSize, "date_added"}, null, null, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                if (cursorQuery == null) {
                    return null;
                }
                cursorQuery.close();
                return null;
            }
            java.lang.String strCopydefault = copydefault(cursorQuery, "_display_name");
            actionBar.AEQbTJ(strCopydefault);
            java.lang.String strCopydefault2 = copydefault(cursorQuery, "title");
            if (android.text.TextUtils.isEmpty(strCopydefault2) && !android.text.TextUtils.isEmpty(strCopydefault)) {
                int iLastIndexOf2 = strCopydefault.lastIndexOf(JwtUtilsKt.JWT_DELIMITER);
                strCopydefault2 = iLastIndexOf2 > 0 ? strCopydefault.substring(0, iLastIndexOf2) : strCopydefault;
            }
            actionBar.gEmmrt(strCopydefault2);
            actionBar.OLrzqt(OLrzqt(cursorQuery, FileInfo.FileSize));
            actionBar.copydefault(OLrzqt(cursorQuery, "date_added"));
            if (mediaPickerType == MediaPickerType.TYPE_VIDEO) {
                actionBar.KWHzl(EZpvd(context, uri));
            }
            actionBar.copydefault(uri.toString());
            if (strCopydefault != null && (iLastIndexOf = strCopydefault.lastIndexOf(JwtUtilsKt.JWT_DELIMITER)) > 0) {
                actionBar.KWHzl(strCopydefault.substring(iLastIndexOf + 1));
            }
            cursorQuery.close();
            return actionBar.OLrzqt();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    public static long EZpvd(android.content.Context context, android.net.Uri uri) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(context, uri);
                java.lang.String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                if (strExtractMetadata != null) {
                    return java.lang.Long.parseLong(strExtractMetadata);
                }
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            try {
                mediaMetadataRetriever.release();
                return 0L;
            } catch (java.io.IOException e2) {
                e2.printStackTrace();
                return 0L;
            }
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (java.io.IOException e3) {
                e3.printStackTrace();
            }
        }
    }

    public static java.lang.String OLrzqt(long j) {
        if (j >= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return (j / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) + "MB";
        }
        if (j >= 1024) {
            return (j / 1024) + "KB";
        }
        if (j >= 1024) {
            return "0KB";
        }
        return j + "B";
    }

    public static java.lang.String EZpvd(java.lang.String str) {
        int iLastIndexOf;
        if (!android.text.TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(JwtUtilsKt.JWT_DELIMITER)) >= 0) {
            return str.substring(iLastIndexOf + 1);
        }
        return null;
    }

    public static MediaInfo AEQbTJ(java.lang.String str, java.lang.String str2, MediaPickerType mediaPickerType, java.lang.String str3, long j, long j2, long j3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        return new MediaInfo.ActionBar().gEmmrt(str).AEQbTJ(str2).copydefault(mediaPickerType).copydefault(str3).copydefault(j).OLrzqt(j2).KWHzl(j3).OLrzqt(str4).EZpvd(str5).KWHzl(str6).OLrzqt();
    }
}
