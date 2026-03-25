package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.nft.ui.mediapicker.data.bean.MediaInfo;
import com.okinc.nft.ui.mediapicker.data.constants.MediaPickerType;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C43648rtJ;

/* JADX INFO: renamed from: o.rts, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43683rts extends AbstractC33073mpa {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.rtr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43683rts.EZpvd();
        }
    });

    public static final MutableLiveData EZpvd() {
        return new MutableLiveData();
    }

    public final MutableLiveData<java.util.List<MediaInfo>> AEQbTJ() {
        return (MutableLiveData) this.EZpvd.getValue();
    }

    public final void KWHzl() {
        ThreadUtils.djBIcL().execute(new java.lang.Runnable() { // from class: o.rtu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C43683rts.KWHzl(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.rts$Activity */
    public static final class Activity implements C43648rtJ.StateListAnimator {
        public final /* synthetic */ C43683rts KWHzl;
        public final /* synthetic */ java.util.ArrayList<MediaInfo> OLrzqt;

        @Override // o.C43648rtJ.StateListAnimator
        public void EZpvd(int i) {
        }

        @Override // o.C43648rtJ.StateListAnimator
        public void KWHzl() {
        }

        public Activity(java.util.ArrayList<MediaInfo> arrayList, C43683rts c43683rts) {
            this.OLrzqt = arrayList;
            this.KWHzl = c43683rts;
        }

        @Override // o.C43648rtJ.StateListAnimator
        public void OLrzqt(int i, MediaInfo mediaInfo) {
            Intrinsics.checkNotNullParameter(mediaInfo, "");
            if (mediaInfo.gEmmrt() != null) {
                if (C59449zhJ.gEmmrt(mediaInfo.gEmmrt(), "mp3", true) || C59449zhJ.gEmmrt(mediaInfo.gEmmrt(), "wav", true)) {
                    mediaInfo.KWHzl(MediaPickerType.TYPE_AUDIO);
                    this.OLrzqt.add(mediaInfo);
                } else if (C59449zhJ.gEmmrt(mediaInfo.gEmmrt(), "webm", true)) {
                    mediaInfo.KWHzl(MediaPickerType.TYPE_VIDEO);
                    this.OLrzqt.add(mediaInfo);
                }
            }
        }

        @Override // o.C43648rtJ.StateListAnimator
        public void OLrzqt() {
            this.KWHzl.AEQbTJ().postValue(this.OLrzqt);
        }
    }

    public static final void KWHzl(C43683rts c43683rts) {
        C43648rtJ.EZpvd(C32979mnm.EZpvd.OLrzqt(), new Activity(new java.util.ArrayList(), c43683rts));
    }
}
