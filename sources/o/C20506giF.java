package o;

import android.widget.FrameLayout;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxExplain;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.giF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20506giF extends android.widget.FrameLayout {
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20506giF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        android.view.LayoutInflater.from(context).inflate(C13754dXa.TaskDescription.zbGDDc, (android.view.ViewGroup) this, true);
        this.OLrzqt = (android.widget.TextView) findViewById(C13754dXa.ActionBar.PlaybackStateCompatBuilder);
        this.EZpvd = (android.widget.TextView) findViewById(C13754dXa.ActionBar.getRccStateFromState);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C20506giF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C20506giF(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setData(@NotNull TxExplain.Desc desc) {
        Intrinsics.checkNotNullParameter(desc, "");
        this.OLrzqt.setText(desc.getText());
        this.EZpvd.setText(desc.getDesc());
    }

    public final void setTitleText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.setText(str);
    }

    public final void setDescText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.setText(str);
    }
}
