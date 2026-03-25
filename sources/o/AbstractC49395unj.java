package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC49395unj extends AbstractC52792wYn {
    public abstract java.lang.String copydefault();

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        java.lang.String strCopydefault = copydefault();
        kotlin.Pair[] pairArr = (kotlin.Pair[]) C56427yEz.AkhnZx(KWHzl()).toArray(new kotlin.Pair[0]);
        C49396unk.registerTradeFragmentTrack$default(this, strCopydefault, (kotlin.Pair[]) java.util.Arrays.copyOf(pairArr, pairArr.length), null, 4, null);
    }

    public java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return C56424yEw.KWHzl();
    }
}
