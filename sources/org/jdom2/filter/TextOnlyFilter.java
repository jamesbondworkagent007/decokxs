package org.jdom2.filter;

import org.jdom2.Content;
import org.jdom2.Text;

/* JADX INFO: loaded from: classes24.dex */
final class TextOnlyFilter extends AbstractFilter<Text> {
    private static final long serialVersionUID = 200;

    /* JADX DEBUG: Method merged with bridge method: filter(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // org.jdom2.filter.Filter
    public Text filter(Object obj) {
        if (!(obj instanceof Text)) {
            return null;
        }
        Text text = (Text) obj;
        if (text.getCType() == Content.CType.Text) {
            return text;
        }
        return null;
    }

    public int hashCode() {
        return TextOnlyFilter.class.hashCode();
    }

    public boolean equals(Object obj) {
        return obj instanceof TextOnlyFilter;
    }
}
