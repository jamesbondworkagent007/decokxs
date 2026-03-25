package o;

import android.widget.CompoundButton;
import androidx.collection.ArrayMapKt;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.itI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25253itI extends android.widget.LinearLayout {
    public C21607hFq KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChecked(boolean z) {
        this.copydefault = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25253itI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25253itI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25253itI(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25253itI(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void EZpvd(@NotNull java.lang.String str, boolean z) {
        java.lang.String chainName;
        java.lang.String chainName2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        if (getContext() == null) {
            return;
        }
        C21607hFq c21607hFqCopydefault = C21607hFq.copydefault(android.view.LayoutInflater.from(getContext()), this, true);
        this.KWHzl = c21607hFqCopydefault;
        if (c21607hFqCopydefault != null) {
            c21607hFqCopydefault.copydefault.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.itM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z2) {
                    C25253itI.AEQbTJ(this.EZpvd, compoundButton, z2);
                }
            });
            InterfaceC22824hme interfaceC22824hmeOLrzqt = C22380heK.OLrzqt.copydefault(str).OLrzqt(z);
            DexMultiTokenInfoBean value = interfaceC22824hmeOLrzqt.KWHzl().getValue();
            if (value == null || (chainName = value.getChainName()) == null) {
                chainName = "";
            }
            DexMultiTokenInfoBean value2 = interfaceC22824hmeOLrzqt.EZpvd().getValue();
            if (value2 != null && (chainName2 = value2.getChainName()) != null) {
                str2 = chainName2;
            }
            c21607hFqCopydefault.AEQbTJ.setText(C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.onSeekTo, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("fromChain", chainName), C56390yDp.OLrzqt("toChain", str2))));
        }
    }

    public static final void AEQbTJ(C25253itI c25253itI, android.widget.CompoundButton compoundButton, boolean z) {
        c25253itI.copydefault = z;
    }
}
