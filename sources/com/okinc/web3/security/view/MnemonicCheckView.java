package com.okinc.web3.security.view;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.web3.security.bridge.Web3SecurityBridge;
import com.okinc.web3.security.model.Mnemonic;
import com.okinc.web3.security.view.MnemonicCheckView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC59533zio;
import o.C33061mpO;
import o.C33070mpX;
import o.C52761wXj;
import o.C56391yDq;
import o.C56548yJl;
import o.C57407yho;
import o.C59534zip;
import o.pUU;
import o.yDY;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class MnemonicCheckView extends RecyclerView {
    public static final int $stable = 8;
    private final HashMap<Integer, String> answers;
    private final ArrayList<Object> list;
    private Function1<? super Boolean, Unit> onFinish;
    private List<Question> questions;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnFinish(@NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.onFinish = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MnemonicCheckView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.answers = new HashMap<>();
        this.list = new ArrayList<>();
        initView();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MnemonicCheckView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.answers = new HashMap<>();
        this.list = new ArrayList<>();
        initView();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MnemonicCheckView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.answers = new HashMap<>();
        this.list = new ArrayList<>();
        initView();
    }

    private final void initView() {
        setOverScrollMode(2);
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(SelectData.class, new AbstractC59533zio<SelectData, ViewHolder>() { // from class: com.okinc.web3.security.view.MnemonicCheckView$initView$1$1
            /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
            @Override // o.AbstractC59533zio
            public MnemonicCheckView.ViewHolder onCreateViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(layoutInflater, "");
                Intrinsics.checkNotNullParameter(viewGroup, "");
                View viewInflate = layoutInflater.inflate(C57407yho.StateListAnimator.fetchVPNInfo, viewGroup, false);
                MnemonicCheckView mnemonicCheckView = this.this$0;
                Intrinsics.copydefault(viewInflate);
                return new MnemonicCheckView.ViewHolder(mnemonicCheckView, viewInflate);
            }

            /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
            @Override // o.AbstractC59533zio
            public void onBindViewHolder(MnemonicCheckView.ViewHolder viewHolder, MnemonicCheckView.SelectData selectData) {
                Intrinsics.checkNotNullParameter(viewHolder, "");
                Intrinsics.checkNotNullParameter(selectData, "");
                viewHolder.bindItem(selectData);
            }
        });
        this.list.clear();
        this.list.addAll(getList());
        c59534zip.setItems(this.list);
        setAdapter(c59534zip);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final View.OnClickListener clickListener;
        private final TextView index;
        final /* synthetic */ MnemonicCheckView this$0;
        private final TextView word0;
        private final TextView word1;
        private final TextView word2;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final View.OnClickListener getClickListener() {
            return this.clickListener;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull final MnemonicCheckView mnemonicCheckView, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.this$0 = mnemonicCheckView;
            this.index = (TextView) view.findViewById(C57407yho.Application.hDKMBd);
            TextView textView = (TextView) view.findViewById(C57407yho.Application.dmfpNf);
            this.word0 = textView;
            TextView textView2 = (TextView) view.findViewById(C57407yho.Application.hrNTAI);
            this.word1 = textView2;
            TextView textView3 = (TextView) view.findViewById(C57407yho.Application.OHqIaq);
            this.word2 = textView3;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.okinc.web3.security.view.MnemonicCheckView$ViewHolder$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MnemonicCheckView.ViewHolder.clickListener$lambda$1(mnemonicCheckView, this, view2);
                }
            };
            this.clickListener = onClickListener;
            if (textView != null) {
                textView.setOnClickListener(onClickListener);
            }
            if (textView2 != null) {
                textView2.setOnClickListener(onClickListener);
            }
            if (textView3 != null) {
                textView3.setOnClickListener(onClickListener);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void clickListener$lambda$1(MnemonicCheckView mnemonicCheckView, ViewHolder viewHolder, View view) {
            List<ItemData> options;
            boolean z;
            Intrinsics.copydefault(view);
            CharSequence text = ((TextView) view).getText();
            Object obj = mnemonicCheckView.list.get(viewHolder.getPosition());
            SelectData selectData = obj instanceof SelectData ? (SelectData) obj : null;
            if (selectData != null && (options = selectData.getOptions()) != null) {
                for (ItemData itemData : options) {
                    if (text != null) {
                        z = text.equals(itemData.getOption());
                    }
                    itemData.setStatus(z);
                    if (itemData.getStatus()) {
                        mnemonicCheckView.answers.put(Integer.valueOf(viewHolder.getPosition()), itemData.getOption());
                    }
                }
            }
            mnemonicCheckView.onSelectWord();
            RecyclerView.Adapter adapter = mnemonicCheckView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(viewHolder.getPosition());
            }
        }

        public final void bindItem(@NotNull SelectData selectData) {
            Intrinsics.checkNotNullParameter(selectData, "");
            int wordPosition = selectData.getWordPosition();
            String str = C33070mpX.AYXKKw(C57407yho.Activity.AYXKKw) + String.valueOf(wordPosition);
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, " ", 0, false, 6, (Object) null);
            if (iIndexOf$default < 0) {
                iIndexOf$default = 0;
            }
            String strSubstring = str.substring(iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            this.index.setText(C33061mpO.setupSpanStyles$default(str, new String[]{strSubstring}, 0, null, false, new Function1() { // from class: com.okinc.web3.security.view.MnemonicCheckView$ViewHolder$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MnemonicCheckView.ViewHolder.bindItem$lambda$2((List) obj);
                }
            }, 14, null));
            List<ItemData> options = selectData.getOptions();
            if (!options.isEmpty()) {
                int size = options.size();
                for (int i = 0; i < size; i++) {
                    if (i == 0) {
                        this.word0.setText(options.get(0).getOption());
                        this.word0.setSelected(options.get(0).getStatus());
                    } else if (i == 1) {
                        this.word1.setText(options.get(1).getOption());
                        this.word1.setSelected(options.get(1).getStatus());
                    } else if (i == 2) {
                        this.word2.setText(options.get(2).getOption());
                        this.word2.setSelected(options.get(2).getStatus());
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindItem$lambda$2(List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
            return Unit.INSTANCE;
        }
    }

    private final ArrayList<Object> getList() {
        ArrayList<Object> arrayList = new ArrayList<>();
        List<Question> list = this.questions;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = list.get(i).getOptions().iterator();
                while (it.hasNext()) {
                    arrayList2.add(new ItemData((String) it.next(), false));
                }
                arrayList.add(new SelectData(list.get(i).getWordPosition(), list.get(i).getAnswer(), arrayList2));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSelectWord() {
        Function1<? super Boolean, Unit> function1;
        List<Question> list = this.questions;
        if (list == null || this.answers.size() != list.size() || (function1 = this.onFinish) == null) {
            return;
        }
        function1.invoke(Boolean.TRUE);
    }

    public final void setMnemonicList(@NotNull Mnemonic mnemonic) {
        Intrinsics.checkNotNullParameter(mnemonic, "");
        this.questions = generateQuestions(mnemonic, 2);
        setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.list.clear();
        this.list.addAll(getList());
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public static /* synthetic */ void clear$default(MnemonicCheckView mnemonicCheckView, Mnemonic mnemonic, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        mnemonicCheckView.clear(mnemonic, z);
    }

    public final void clear(@NotNull Mnemonic mnemonic, boolean z) {
        Intrinsics.checkNotNullParameter(mnemonic, "");
        if (z) {
            this.questions = generateQuestions(mnemonic, 2);
        }
        this.answers.clear();
        this.list.clear();
        this.list.addAll(getList());
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final boolean checkSuccess() {
        List<Question> list = this.questions;
        if (list == null || list.isEmpty()) {
            return false;
        }
        int size = this.answers.size();
        List<Question> list2 = this.questions;
        Intrinsics.copydefault(list2);
        if (size != list2.size()) {
            return false;
        }
        List<Question> list3 = this.questions;
        Intrinsics.copydefault(list3);
        int size2 = list3.size();
        for (int i = 0; i < size2; i++) {
            String str = this.answers.get(Integer.valueOf(i));
            List<Question> list4 = this.questions;
            Intrinsics.copydefault(list4);
            if (!Intrinsics.EZpvd((Object) str, (Object) list4.get(i).getAnswer())) {
                return false;
            }
        }
        return true;
    }

    private final List<Question> generateQuestions(Mnemonic mnemonic, int i) {
        try {
            Result.Application application = Result.Companion;
            List<String> randomFrom = getRandomFrom(Web3SecurityBridge.INSTANCE.getWordList$OKWeb3Security_web3_security_lib(mnemonic.getLanguage()), i * 3, mnemonic.getWords());
            List randomFrom$default = getRandomFrom$default(this, mnemonic.getWords(), 3, null, 4, null);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < 3) {
                String str = (String) randomFrom$default.get(i2);
                int i3 = i2 + 1;
                List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) randomFrom.subList(i2 * i, i3 * i));
                listFJNWhG.add(str);
                Collections.shuffle(listFJNWhG);
                arrayList.add(new Question(mnemonic.getWords().indexOf(str) + 1, str, listFJNWhG));
                i2 = i3;
            }
            return CollectionsKt___CollectionsKt.EZpvd(arrayList, new Comparator() { // from class: com.okinc.web3.security.view.MnemonicCheckView$generateQuestions$lambda$5$$inlined$sortedBy$1
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return yET.KWHzl(Integer.valueOf(((MnemonicCheckView.Question) t).getWordPosition()), Integer.valueOf(((MnemonicCheckView.Question) t2).getWordPosition()));
                }
            });
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Object objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("MnemonicCheckView", "generateQuestions failed", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = yDY.AhwBna();
            }
            return (List) objM7377constructorimpl;
        }
    }

    public static /* synthetic */ List generateQuestions$default(MnemonicCheckView mnemonicCheckView, Mnemonic mnemonic, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 5;
        }
        return mnemonicCheckView.generateQuestions(mnemonic, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.web3.security.view.MnemonicCheckView */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List getRandomFrom$default(MnemonicCheckView mnemonicCheckView, List list, int i, List list2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list2 = new ArrayList();
        }
        return mnemonicCheckView.getRandomFrom(list, i, list2);
    }

    private final List<String> getRandomFrom(List<String> list, int i, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (i > 0) {
            int iEZpvd = C56548yJl.EZpvd(C56548yJl.AhwBna(0, size), Random.Default);
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(iEZpvd));
            String str = list.get(num != null ? num.intValue() : iEZpvd);
            if (list2.isEmpty() || !list2.contains(str)) {
                i--;
                arrayList.add(str);
                size--;
                Integer num2 = (Integer) linkedHashMap.get(Integer.valueOf(size));
                linkedHashMap.put(Integer.valueOf(iEZpvd), Integer.valueOf(num2 != null ? num2.intValue() : size));
            }
        }
        return arrayList;
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class SelectData {
        public static final int $stable = 8;
        private String answer;
        private List<ItemData> options;
        private int wordPosition;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SelectData() {
            this(0, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.web3.security.view.MnemonicCheckView$SelectData */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SelectData copy$default(SelectData selectData, int i, String str, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = selectData.wordPosition;
            }
            if ((i2 & 2) != 0) {
                str = selectData.answer;
            }
            if ((i2 & 4) != 0) {
                list = selectData.options;
            }
            return selectData.copy(i, str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.wordPosition;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.answer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<ItemData> component3() {
            return this.options;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SelectData copy(int i, @NotNull String str, @NotNull List<ItemData> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new SelectData(i, str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectData)) {
                return false;
            }
            SelectData selectData = (SelectData) obj;
            return this.wordPosition == selectData.wordPosition && Intrinsics.EZpvd((Object) this.answer, (Object) selectData.answer) && Intrinsics.EZpvd(this.options, selectData.options);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAnswer() {
            return this.answer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<ItemData> getOptions() {
            return this.options;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getWordPosition() {
            return this.wordPosition;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Integer.hashCode(this.wordPosition) * 31) + this.answer.hashCode()) * 31) + this.options.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAnswer(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.answer = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOptions(@NotNull List<ItemData> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.options = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setWordPosition(int i) {
            this.wordPosition = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SelectData(wordPosition=" + this.wordPosition + ", answer=" + this.answer + ", options=" + this.options + ")";
        }

        public SelectData(int i, @NotNull String str, @NotNull List<ItemData> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.wordPosition = i;
            this.answer = str;
            this.options = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0011: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:246) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.List))
 A[MD:(int, java.lang.String, java.util.List<com.okinc.web3.security.view.MnemonicCheckView$ItemData>):void (m)] (LINE:243) call: com.okinc.web3.security.view.MnemonicCheckView.SelectData.<init>(int, java.lang.String, java.util.List):void type: THIS */
        public /* synthetic */ SelectData(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? new ArrayList() : list);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class ItemData {
        public static final int $stable = 8;
        private String option;
        private boolean status;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ItemData() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ItemData copy$default(ItemData itemData, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = itemData.option;
            }
            if ((i & 2) != 0) {
                z = itemData.status;
            }
            return itemData.copy(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.option;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component2() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ItemData copy(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ItemData(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemData)) {
                return false;
            }
            ItemData itemData = (ItemData) obj;
            return Intrinsics.EZpvd((Object) this.option, (Object) itemData.option) && this.status == itemData.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOption() {
            return this.option;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getStatus() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.option.hashCode() * 31) + Boolean.hashCode(this.status);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOption(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.option = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setStatus(boolean z) {
            this.status = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ItemData(option=" + this.option + ", status=" + this.status + ")";
        }

        public ItemData(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.option = str;
            this.status = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:249) call: com.okinc.web3.security.view.MnemonicCheckView.ItemData.<init>(java.lang.String, boolean):void type: THIS */
        public /* synthetic */ ItemData(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Question {
        public static final int $stable = 8;
        private String answer;
        private List<String> options;
        private int wordPosition;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Question() {
            this(0, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.web3.security.view.MnemonicCheckView$Question */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Question copy$default(Question question, int i, String str, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = question.wordPosition;
            }
            if ((i2 & 2) != 0) {
                str = question.answer;
            }
            if ((i2 & 4) != 0) {
                list = question.options;
            }
            return question.copy(i, str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.wordPosition;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.answer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component3() {
            return this.options;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Question copy(int i, @NotNull String str, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Question(i, str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Question)) {
                return false;
            }
            Question question = (Question) obj;
            return this.wordPosition == question.wordPosition && Intrinsics.EZpvd((Object) this.answer, (Object) question.answer) && Intrinsics.EZpvd(this.options, question.options);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAnswer() {
            return this.answer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getOptions() {
            return this.options;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getWordPosition() {
            return this.wordPosition;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Integer.hashCode(this.wordPosition) * 31) + this.answer.hashCode()) * 31) + this.options.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAnswer(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.answer = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOptions(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.options = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setWordPosition(int i) {
            this.wordPosition = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Question(wordPosition=" + this.wordPosition + ", answer=" + this.answer + ", options=" + this.options + ")";
        }

        public Question(int i, @NotNull String str, @NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.wordPosition = i;
            this.answer = str;
            this.options = list;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0011: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:260) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.List))
 A[MD:(int, java.lang.String, java.util.List<java.lang.String>):void (m)] (LINE:257) call: com.okinc.web3.security.view.MnemonicCheckView.Question.<init>(int, java.lang.String, java.util.List):void type: THIS */
        public /* synthetic */ Question(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? new ArrayList() : list);
        }
    }
}
