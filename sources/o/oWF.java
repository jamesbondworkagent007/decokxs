package o;

import androidx.camera.video.AudioStats;
import o.oWC;

/* JADX INFO: loaded from: classes8.dex */
public class oWF extends oWC {
    public oWF(java.lang.String str) {
        super(str);
    }

    @Override // o.oWC
    public void KWHzl(oWC.TaskDescription taskDescription) {
        taskDescription.OLrzqt = AudioStats.AUDIO_AMPLITUDE_NONE;
        taskDescription.KWHzl = java.lang.Math.max(taskDescription.KWHzl, AudioStats.AUDIO_AMPLITUDE_NONE);
    }
}
