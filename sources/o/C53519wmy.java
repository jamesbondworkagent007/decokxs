package o;

import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wmy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53519wmy {
    public final java.util.Map<C47988uAv, java.lang.String> copydefault;

    public C53519wmy(@NotNull java.util.Map<C47988uAv, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.copydefault = map;
    }

    /* JADX INFO: renamed from: o.wmy$Activity */
    public static final class Activity extends uBF {
        public final /* synthetic */ Map.Entry<C47988uAv, java.lang.String> KWHzl;

        public Activity(Map.Entry<C47988uAv, java.lang.String> entry) {
            this.KWHzl = entry;
        }

        @Override // o.uBH, android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            C56028xvA.OLrzqt(this.KWHzl.getValue(), C56423yEv.EZpvd(C56390yDp.OLrzqt(Web3SecurityTrackEvent.VALUE_INPUT, java.lang.String.valueOf(charSequence))));
        }
    }

    public final void copydefault() {
        java.util.Iterator<T> it = this.copydefault.keySet().iterator();
        while (it.hasNext()) {
            ((C47988uAv) it.next()).EZpvd();
        }
    }

    public final void EZpvd() {
        for (Map.Entry<C47988uAv, java.lang.String> entry : this.copydefault.entrySet()) {
            entry.getKey().copydefault(new Activity(entry));
        }
    }
}
