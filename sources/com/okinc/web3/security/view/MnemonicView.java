package com.okinc.web3.security.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.web3.security.view.MnemonicView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59533zio;
import o.C33064mpR;
import o.C57407yho;
import o.C59534zip;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class MnemonicView extends RecyclerView {
    public static final int $stable = 8;
    private C59534zip mAdapter;
    private int spanCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MnemonicView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.spanCount = 3;
        initView();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MnemonicView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.spanCount = 3;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C57407yho.TaskDescription.copydefault);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            this.spanCount = typedArrayObtainStyledAttributes.getInteger(C57407yho.TaskDescription.AYXKKw, 3);
            typedArrayObtainStyledAttributes.recycle();
        }
        initView();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MnemonicView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.spanCount = 3;
        initView();
    }

    private final void initView() {
        setLayoutManager(new GridLayoutManager(getContext(), this.spanCount));
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(SeedPhraseBean.class, new AbstractC59533zio<SeedPhraseBean, RecyclerView.ViewHolder>() { // from class: com.okinc.web3.security.view.MnemonicView$initView$1$1
            @Override // o.AbstractC59533zio
            public RecyclerView.ViewHolder onCreateViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(layoutInflater, "");
                Intrinsics.checkNotNullParameter(viewGroup, "");
                final View viewInflate = layoutInflater.inflate(C57407yho.StateListAnimator.DbNXlk, viewGroup, false);
                return new RecyclerView.ViewHolder(viewInflate) { // from class: com.okinc.web3.security.view.MnemonicView$initView$1$1$onCreateViewHolder$1
                };
            }

            /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
            @Override // o.AbstractC59533zio
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, MnemonicView.SeedPhraseBean seedPhraseBean) {
                String strValueOf;
                Intrinsics.checkNotNullParameter(viewHolder, "");
                Intrinsics.checkNotNullParameter(seedPhraseBean, "");
                TextView textView = (TextView) viewHolder.itemView.findViewById(C57407yho.Application.hDKMBd);
                if (seedPhraseBean.getPosition() < 10) {
                    strValueOf = "0" + seedPhraseBean.getPosition();
                } else {
                    strValueOf = String.valueOf(seedPhraseBean.getPosition());
                }
                textView.setText(strValueOf);
                ((TextView) viewHolder.itemView.findViewById(C57407yho.Application.hBpjJd)).setText(seedPhraseBean.getContent());
            }
        });
        this.mAdapter = c59534zip;
        setAdapter(c59534zip);
    }

    public final void setMnemonicList(@NotNull List<String> list) {
        C59534zip c59534zip;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty() || (c59534zip = this.mAdapter) == null) {
            return;
        }
        C33064mpR.OLrzqt(c59534zip, change2NewList(list));
    }

    private final List<SeedPhraseBean> change2NewList(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new SeedPhraseBean(i2, (String) obj));
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class SeedPhraseBean {
        private String content;
        private int position;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SeedPhraseBean() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SeedPhraseBean copy$default(SeedPhraseBean seedPhraseBean, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = seedPhraseBean.position;
            }
            if ((i2 & 2) != 0) {
                str = seedPhraseBean.content;
            }
            return seedPhraseBean.copy(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.position;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.content;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SeedPhraseBean copy(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SeedPhraseBean(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SeedPhraseBean)) {
                return false;
            }
            SeedPhraseBean seedPhraseBean = (SeedPhraseBean) obj;
            return this.position == seedPhraseBean.position && Intrinsics.EZpvd((Object) this.content, (Object) seedPhraseBean.content);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContent() {
            return this.content;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getPosition() {
            return this.position;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.position) * 31) + this.content.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setContent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.content = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPosition(int i) {
            this.position = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SeedPhraseBean(position=" + this.position + ", content=" + this.content + ")";
        }

        public SeedPhraseBean(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.position = i;
            this.content = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r1v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(int, java.lang.String):void (m)] (LINE:93) call: com.okinc.web3.security.view.MnemonicView.SeedPhraseBean.<init>(int, java.lang.String):void type: THIS */
        public /* synthetic */ SeedPhraseBean(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? "" : str);
        }
    }
}
