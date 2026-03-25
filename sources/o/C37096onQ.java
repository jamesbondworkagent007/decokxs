package o;

import com.okinc.okimcore.model.im.OKAudioCallRecordMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.onQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37096onQ extends AbstractC37101onV<OKAudioCallRecordMessage> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC35703oAo
    public java.lang.Class<OKAudioCallRecordMessage> KWHzl() {
        return OKAudioCallRecordMessage.class;
    }

    @Override // o.AbstractC37101onV, o.oAE, o.AbstractC35707oAs
    public /* synthetic */ void copydefault(oAC oac, C35254nrp c35254nrp, OKMessageContent oKMessageContent) {
        OLrzqt((oAC<AbstractC44111sDt, nLR>) oac, c35254nrp, (OKAudioCallRecordMessage) oKMessageContent);
    }

    public void OLrzqt(@NotNull oAC<AbstractC44111sDt, nLR> oac, @NotNull C35254nrp c35254nrp, @NotNull OKAudioCallRecordMessage oKAudioCallRecordMessage) {
        Intrinsics.checkNotNullParameter(oac, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        Intrinsics.checkNotNullParameter(oKAudioCallRecordMessage, "");
        super.copydefault(oac, c35254nrp, oKAudioCallRecordMessage);
        android.widget.TextView textView = ((nLR) oac.EZpvd()).EZpvd;
        textView.setText(C37127onv.AEQbTJ.OLrzqt(oKAudioCallRecordMessage));
        android.graphics.drawable.Drawable drawable = textView.getResources().getDrawable(C35399nuc.ActionBar.zsXlph);
        textView.setCompoundDrawablePadding(C57676yms.EZpvd(textView.getContext(), 8.0f));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/content/Context;Lcom/okinc/okimcore/model/im/OKMessageContent;Lcom/okinc/okimcore/model/im/OKMessage;)Ljava/lang/CharSequence; */
    @Override // o.AbstractC35703oAo
    public java.lang.CharSequence KWHzl(@NotNull android.content.Context context, @NotNull OKAudioCallRecordMessage oKAudioCallRecordMessage, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKAudioCallRecordMessage, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        return "[" + C37127onv.AEQbTJ.OLrzqt(oKAudioCallRecordMessage) + "]";
    }
}
