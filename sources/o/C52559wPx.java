package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wPx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52559wPx {
    public static final void KWHzl(@NotNull ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, @NotNull java.util.ArrayList<C55846xre> arrayList) {
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(viewOnClickListenerC54939xaY.getContext()).inflate(C48033uCm.Activity.hwXsuq, (android.view.ViewGroup) null, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C48033uCm.Application.MediaBrowserCompatMediaItem1);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(viewInflate.getContext()));
        C59534zip c59534zip = new C59534zip();
        recyclerView.setAdapter(c59534zip);
        c59534zip.register(C55846xre.class, new wNO());
        C33064mpR.OLrzqt(c59534zip, arrayList);
        Intrinsics.copydefault(viewInflate);
        ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, viewInflate, 0, 2, null);
    }
}
