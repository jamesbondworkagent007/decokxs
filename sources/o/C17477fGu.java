package o;

import android.media.AudioManager;
import com.google.android.exoplayer2.util.MimeTypes;
import com.okinc.business.defi.biz.net.bean.CreateMpcResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.fGu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17477fGu implements Function1 {
    public static int EZpvd;
    public static int copydefault;
    public final /* synthetic */ java.lang.String AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.fFW.EZpvd(o.mov, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1<? super o.ctV, kotlin.Unit>):void] */
    public /* synthetic */ C17477fGu(java.lang.String str) {
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fFW.copydefault(java.lang.String, com.okinc.business.defi.biz.net.bean.CreateMpcResponse):o.zvd */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return fFW.EZpvd(this.AEQbTJ, (CreateMpcResponse) obj);
    }

    public static int AEQbTJ() {
        int i = EZpvd;
        int i2 = i % 8570771;
        EZpvd = i + 1;
        if (i2 != 0) {
            return copydefault;
        }
        int streamVolume = ((AudioManager) ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getSystemService(MimeTypes.BASE_TYPE_AUDIO)).getStreamVolume(3);
        copydefault = streamVolume;
        return streamVolume;
    }
}
