/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.enums;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import com.google.common.collect.*;
import java.util.*;
import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.server.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;
import org.apache.thrift.meta_data.FieldValueMetaData;
import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.MoreObjects.ToStringHelper;

@SwiftGenerated
@ThriftStruct(value="SomeStruct", builder=SomeStruct.Builder.class)
public final class SomeStruct {

    @ThriftConstructor
    public SomeStruct(
        @ThriftField(value=1, name="reasonable", requiredness=Requiredness.NONE) final test.fixtures.enums.Metasyntactic reasonable,
        @ThriftField(value=2, name="fine", requiredness=Requiredness.NONE) final test.fixtures.enums.Metasyntactic fine,
        @ThriftField(value=3, name="questionable", requiredness=Requiredness.NONE) final test.fixtures.enums.Metasyntactic questionable,
        @ThriftField(value=4, name="tags", requiredness=Requiredness.NONE) final Set<Integer> tags
    ) {
        this.reasonable = reasonable;
        this.fine = fine;
        this.questionable = questionable;
        this.tags = tags;
    }
    
    @ThriftConstructor
    protected SomeStruct() {
      this.reasonable = null;
      this.fine = null;
      this.questionable = null;
      this.tags = null;
    }
    
    public static class Builder {
    
        private test.fixtures.enums.Metasyntactic reasonable = test.fixtures.enums.Metasyntactic.FOO;
        private test.fixtures.enums.Metasyntactic fine = test.fixtures.enums.Metasyntactic.BAR;
        private test.fixtures.enums.Metasyntactic questionable = test.fixtures.enums.Metasyntactic.fromInteger(-1);
        private Set<Integer> tags = ImmutableSet.<Integer>builder()
        .build();
    
        @ThriftField(value=1, name="reasonable", requiredness=Requiredness.NONE)
        public Builder setReasonable(test.fixtures.enums.Metasyntactic reasonable) {
            this.reasonable = reasonable;
            return this;
        }
    
        public test.fixtures.enums.Metasyntactic getReasonable() { return reasonable; }
    
            @ThriftField(value=2, name="fine", requiredness=Requiredness.NONE)
        public Builder setFine(test.fixtures.enums.Metasyntactic fine) {
            this.fine = fine;
            return this;
        }
    
        public test.fixtures.enums.Metasyntactic getFine() { return fine; }
    
            @ThriftField(value=3, name="questionable", requiredness=Requiredness.NONE)
        public Builder setQuestionable(test.fixtures.enums.Metasyntactic questionable) {
            this.questionable = questionable;
            return this;
        }
    
        public test.fixtures.enums.Metasyntactic getQuestionable() { return questionable; }
    
            @ThriftField(value=4, name="tags", requiredness=Requiredness.NONE)
        public Builder setTags(Set<Integer> tags) {
            this.tags = tags;
            return this;
        }
    
        public Set<Integer> getTags() { return tags; }
    
        public Builder() { }
        public Builder(SomeStruct other) {
            this.reasonable = other.reasonable;
            this.fine = other.fine;
            this.questionable = other.questionable;
            this.tags = other.tags;
        }
    
        @ThriftConstructor
        public SomeStruct build() {
            SomeStruct result = new SomeStruct (
                this.reasonable,
                this.fine,
                this.questionable,
                this.tags
            );
            return result;
        }
    }
    
    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("SomeStruct");
    private final test.fixtures.enums.Metasyntactic reasonable;
    public static final int _REASONABLE = 1;
    private static final TField REASONABLE_FIELD_DESC = new TField("reasonable", TType.I32, (short)1);
        private final test.fixtures.enums.Metasyntactic fine;
    public static final int _FINE = 2;
    private static final TField FINE_FIELD_DESC = new TField("fine", TType.I32, (short)2);
        private final test.fixtures.enums.Metasyntactic questionable;
    public static final int _QUESTIONABLE = 3;
    private static final TField QUESTIONABLE_FIELD_DESC = new TField("questionable", TType.I32, (short)3);
        private final Set<Integer> tags;
    public static final int _TAGS = 4;
    private static final TField TAGS_FIELD_DESC = new TField("tags", TType.SET, (short)4);
    static {
      NAMES_TO_IDS.put("reasonable", 1);
      FIELD_METADATA.put(1, REASONABLE_FIELD_DESC);
      NAMES_TO_IDS.put("fine", 2);
      FIELD_METADATA.put(2, FINE_FIELD_DESC);
      NAMES_TO_IDS.put("questionable", 3);
      FIELD_METADATA.put(3, QUESTIONABLE_FIELD_DESC);
      NAMES_TO_IDS.put("tags", 4);
      FIELD_METADATA.put(4, TAGS_FIELD_DESC);
    }
    
    @ThriftField(value=1, name="reasonable", requiredness=Requiredness.NONE)
    public test.fixtures.enums.Metasyntactic getReasonable() { return reasonable; }
    
    
    @ThriftField(value=2, name="fine", requiredness=Requiredness.NONE)
    public test.fixtures.enums.Metasyntactic getFine() { return fine; }
    
    
    @ThriftField(value=3, name="questionable", requiredness=Requiredness.NONE)
    public test.fixtures.enums.Metasyntactic getQuestionable() { return questionable; }
    
    
    @ThriftField(value=4, name="tags", requiredness=Requiredness.NONE)
    public Set<Integer> getTags() { return tags; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("reasonable", reasonable);
        helper.add("fine", fine);
        helper.add("questionable", questionable);
        helper.add("tags", tags);
        return helper.toString();
    }
    
    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    
        SomeStruct other = (SomeStruct)o;
    
        return
            Objects.equals(reasonable, other.reasonable) &&
            Objects.equals(fine, other.fine) &&
            Objects.equals(questionable, other.questionable) &&
            Objects.equals(tags, other.tags) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new Object[] {
            reasonable,
            fine,
            questionable,
            tags
        });
    }
    
    
    public static SomeStruct read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(SomeStruct.NAMES_TO_IDS, SomeStruct.FIELD_METADATA);
      SomeStruct.Builder builder = new SomeStruct.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _REASONABLE:
          if (__field.type == TType.I32) {
            test.fixtures.enums.Metasyntactic reasonable = test.fixtures.enums.Metasyntactic.fromInteger(oprot.readI32());
            builder.setReasonable(reasonable);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _FINE:
          if (__field.type == TType.I32) {
            test.fixtures.enums.Metasyntactic fine = test.fixtures.enums.Metasyntactic.fromInteger(oprot.readI32());
            builder.setFine(fine);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _QUESTIONABLE:
          if (__field.type == TType.I32) {
            test.fixtures.enums.Metasyntactic questionable = test.fixtures.enums.Metasyntactic.fromInteger(oprot.readI32());
            builder.setQuestionable(questionable);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _TAGS:
          if (__field.type == TType.SET) {
            Set<Integer> tags;
            {
            TSet _set = oprot.readSetBegin();
            tags = new HashSet<Integer>(Math.max(0, _set.size));
            for (int _i = 0; (_set.size < 0) ? oprot.peekSet() : (_i < _set.size); _i++) {
                
                int _value1 = oprot.readI32();
                tags.add(_value1);
            }
            oprot.readSetEnd();
            }
            builder.setTags(tags);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(oprot, __field.type);
          break;
        }
        oprot.readFieldEnd();
      }
      oprot.readStructEnd();
      return builder.build();
    }
    
    public void write0(TProtocol oprot) throws TException {
      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(REASONABLE_FIELD_DESC);
      oprot.writeI32(this.reasonable == null ? 0 : this.reasonable.getValue());
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(FINE_FIELD_DESC);
      oprot.writeI32(this.fine == null ? 0 : this.fine.getValue());
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(QUESTIONABLE_FIELD_DESC);
      oprot.writeI32(this.questionable == null ? 0 : this.questionable.getValue());
      oprot.writeFieldEnd();
      if (this.tags != null) {
        oprot.writeFieldBegin(TAGS_FIELD_DESC);
        Set<Integer> _iter0 = this.tags;
        oprot.writeSetBegin(new TSet(TType.I32, _iter0.size()));
        for (int _iter1 : _iter0) {
          oprot.writeI32(_iter1);
        }
        oprot.writeSetEnd();
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
}
