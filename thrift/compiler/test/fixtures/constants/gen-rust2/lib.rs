// @generated by Thrift. This file is probably not the place you want to edit!

#![feature(async_await)]
#![allow(non_camel_case_types, non_snake_case, non_upper_case_globals)]

extern crate self as module;

pub use self::consts::*;
pub use self::errors::*;
pub use self::types::*;

pub mod consts {
    const myInt: i32 = 1337;

    const name: String = "Mark Zuckerberg";

    const states: Vec<std::collections::BTreeMap<String, i32>> = vec![btreemap!("San Diego" => 3211000, "Sacramento" => 479600, "SF" => 837400), btreemap!("New York" => 8406000, "Albany" => 98400)];

    const x: f64 = 1;

    const y: f64 = 1000000;

    const z: f64 = 1000000000;

    const zeroDoubleValue: f64 = 0;

    const longDoubleValue: f64 = 2.59961000990301e-05;

    const my_company: module::types::Companymodule::types::MyCompany = module::types::Company::FACEBOOK;

    const foo: Stringmodule::types::MyStringIdentifier = "foo";

    const bar: i32module::types::MyIntIdentifier = 42;

    const instagram: module::types::Internship = btreemap!("weeks" => 12, "title" => "Software Engineer", "employer" => module::types::Company::INSTAGRAM);

    const partial_const: module::types::Internship = btreemap!("weeks" => 8, "title" => "Some Job");

    const kRanges: Vec<module::types::Range> = vec![btreemap!("min" => 1, "max" => 2), btreemap!("min" => 5, "max" => 6)];

    const internList: Vec<module::types::Internship> = vec![btreemap!("weeks" => 12, "title" => "Software Engineer", "employer" => module::types::Company::INSTAGRAM), btreemap!("weeks" => 10, "title" => "Sales Intern", "employer" => module::types::Company::FACEBOOK)];

    const pod_0: module::types::struct1 = btreemap!();

    const pod_1: module::types::struct1 = btreemap!("a" => 10, "b" => "foo");

    const pod_2: module::types::struct2 = btreemap!("a" => 98, "b" => "gaz", "c" => btreemap!("a" => 12, "b" => "bar"), "d" => vec![11, 22, 33]);

    const pod_3: module::types::struct3 = btreemap!("a" => "abc", "b" => 456, "c" => btreemap!("a" => 888, "c" => btreemap!("b" => "gaz"), "d" => vec![1, 2, 3]));

    const u_1_1: module::types::union1 = btreemap!("i" => 97);

    const u_1_2: module::types::union1 = btreemap!("d" => 5.6);

    const u_1_3: module::types::union1 = btreemap!();

    const u_2_1: module::types::union2 = btreemap!("i" => 51);

    const u_2_2: module::types::union2 = btreemap!("d" => 6.7);

    const u_2_3: module::types::union2 = btreemap!("s" => btreemap!("a" => 8, "b" => "abacabb"));

    const u_2_4: module::types::union2 = btreemap!("u" => btreemap!("i" => 43));

    const u_2_5: module::types::union2 = btreemap!("u" => btreemap!("d" => 9.8));

    const u_2_6: module::types::union2 = btreemap!("u" => btreemap!());

    const apostrophe: String = "'";

    const tripleApostrophe: String = "'''";

    const quotationMark: String = "\"";

    const backslash: String = "\\\\";

    const escaped_a: String = "\\x61";

    const char2ascii: std::collections::BTreeMap<String, i32> = btreemap!("'" => 39, "\"" => 34, "\\\\" => 92, "\\x61" => 97);

    const escaped_strings: Vec<String> = vec!["\\x61", "\\xab", "\\x6a", "\\xa6", "\\x61yyy", "\\xabyyy", "\\x6ayyy", "\\xa6yyy", "zzz\\x61", "zzz\\xab", "zzz\\x6a", "zzz\\xa6", "zzz\\x61yyy", "zzz\\xabyyy", "zzz\\x6ayyy", "zzz\\xa6yyy"];

    const false_c: bool = false;

    const true_c: bool = true;

    const zero_byte: u8 = 0;

    const zero16: i16 = 0;

    const zero32: i32 = 0;

    const zero64: i64 = 0;

    const zero_dot_zero: f64 = 0;

    const empty_string: String = "";

    const empty_int_list: Vec<i32> = btreemap!();

    const empty_string_list: Vec<String> = btreemap!();

    const empty_int_set: std::collections::BTreeSet<i32> = btreemap!();

    const empty_string_set: std::collections::BTreeSet<String> = btreemap!();

    const empty_int_int_map: std::collections::BTreeMap<i32, i32> = btreemap!();

    const empty_int_string_map: std::collections::BTreeMap<i32, String> = btreemap!();

    const empty_string_int_map: std::collections::BTreeMap<String, i32> = btreemap!();

    const empty_string_string_map: std::collections::BTreeMap<String, String> = btreemap!();
}

pub mod types {
    use fbthrift::{
        Deserialize, GetTType, ProtocolReader, ProtocolWriter, Serialize, TType,
    };

    pub type MyCompany = module::types::Company;

    pub type MyStringIdentifier = String;

    pub type MyIntIdentifier = i32;

    #[derive(Clone, Debug, PartialEq)]
    pub struct Internship {
        pub weeks: i32,
        pub title: String,
        pub employer: Option<module::types::Company>,
    }

    #[derive(Clone, Debug, PartialEq)]
    pub struct UnEnumStruct {
        pub city: module::types::City,
    }

    #[derive(Clone, Debug, PartialEq)]
    pub struct Range {
        pub min: i32,
        pub max: i32,
    }

    #[derive(Clone, Debug, PartialEq)]
    pub struct struct1 {
        pub a: i32,
        pub b: String,
    }

    #[derive(Clone, Debug, PartialEq)]
    pub struct struct2 {
        pub a: i32,
        pub b: String,
        pub c: module::types::struct1,
        pub d: Vec<i32>,
    }

    #[derive(Clone, Debug, PartialEq)]
    pub struct struct3 {
        pub a: String,
        pub b: i32,
        pub c: module::types::struct2,
    }

    #[derive(Clone, Debug, PartialEq)]
    pub struct union1 {
        pub i: i32,
        pub d: f64,
    }

    #[derive(Clone, Debug, PartialEq)]
    pub struct union2 {
        pub i: i32,
        pub d: f64,
        pub s: module::types::struct1,
        pub u: module::types::union1,
    }

    #[derive(Copy, Clone, Eq, PartialEq, Ord, PartialOrd, Hash)]
    pub struct EmptyEnum(pub i32);

    impl EmptyEnum {
    }

    impl Default for EmptyEnum {
        fn default() -> Self {
            EmptyEnum(fbthrift::__UNKNOWN_ID)
        }
    }

    impl<'a> From<&'a EmptyEnum> for i32 {
        #[inline]
        fn from(x: &'a EmptyEnum) -> i32 {
            x.0
        }
    }

    impl From<EmptyEnum> for i32 {
        #[inline]
        fn from(x: EmptyEnum) -> i32 {
            x.0
        }
    }

    impl From<i32> for EmptyEnum {
        #[inline]
        fn from(x: i32) -> Self {
            Self(x)
        }
    }

    impl std::fmt::Display for EmptyEnum {
        fn fmt(&self, fmt: &mut std::fmt::Formatter) -> std::fmt::Result {
            let s: &str = match *self {
                EmptyEnum(x) => return write!(fmt, "{}", x),
            };
            write!(fmt, "{}", s)
        }
    }

    impl std::fmt::Debug for EmptyEnum {
        fn fmt(&self, fmt: &mut std::fmt::Formatter) -> std::fmt::Result {
            write!(fmt, "{}::{}", "EmptyEnum", self)
        }
    }

    impl std::str::FromStr for EmptyEnum {
        type Err = failure::Error;

        fn from_str(string: &str) -> Result<Self, Self::Err> {
            match string {
                _ => failure::bail!("Unable to parse {} as {}", string, "EmptyEnum"),
            }
        }
    }

    impl GetTType for EmptyEnum {
        const TTYPE: TType = TType::I32;
    }

    impl<'a, P: ProtocolWriter> Serialize<P> for &'a EmptyEnum {
        #[inline]
        fn write(self, p: &mut P) {
            p.write_i32(self.into())
        }
    }

    impl<P: ProtocolReader> Deserialize<P> for EmptyEnum {
        #[inline]
        fn read(p: &mut P) -> failure::Fallible<Self> {
            Ok(EmptyEnum::from(p.read_i32()?))
        }
    }

    #[derive(Copy, Clone, Eq, PartialEq, Ord, PartialOrd, Hash)]
    pub struct City(pub i32);

    impl City {
        pub const NYC: Self = City(0i32);
        pub const MPK: Self = City(1i32);
        pub const SEA: Self = City(2i32);
        pub const LON: Self = City(3i32);
    }

    impl Default for City {
        fn default() -> Self {
            City(fbthrift::__UNKNOWN_ID)
        }
    }

    impl<'a> From<&'a City> for i32 {
        #[inline]
        fn from(x: &'a City) -> i32 {
            x.0
        }
    }

    impl From<City> for i32 {
        #[inline]
        fn from(x: City) -> i32 {
            x.0
        }
    }

    impl From<i32> for City {
        #[inline]
        fn from(x: i32) -> Self {
            Self(x)
        }
    }

    impl std::fmt::Display for City {
        fn fmt(&self, fmt: &mut std::fmt::Formatter) -> std::fmt::Result {
            let s: &str = match *self {
                City::NYC => "NYC",
                City::MPK => "MPK",
                City::SEA => "SEA",
                City::LON => "LON",
                City(x) => return write!(fmt, "{}", x),
            };
            write!(fmt, "{}", s)
        }
    }

    impl std::fmt::Debug for City {
        fn fmt(&self, fmt: &mut std::fmt::Formatter) -> std::fmt::Result {
            write!(fmt, "{}::{}", "City", self)
        }
    }

    impl std::str::FromStr for City {
        type Err = failure::Error;

        fn from_str(string: &str) -> Result<Self, Self::Err> {
            match string {
                "NYC" => Ok(City::NYC),
                "MPK" => Ok(City::MPK),
                "SEA" => Ok(City::SEA),
                "LON" => Ok(City::LON),
                _ => failure::bail!("Unable to parse {} as {}", string, "City"),
            }
        }
    }

    impl GetTType for City {
        const TTYPE: TType = TType::I32;
    }

    impl<'a, P: ProtocolWriter> Serialize<P> for &'a City {
        #[inline]
        fn write(self, p: &mut P) {
            p.write_i32(self.into())
        }
    }

    impl<P: ProtocolReader> Deserialize<P> for City {
        #[inline]
        fn read(p: &mut P) -> failure::Fallible<Self> {
            Ok(City::from(p.read_i32()?))
        }
    }

    #[derive(Copy, Clone, Eq, PartialEq, Ord, PartialOrd, Hash)]
    pub struct Company(pub i32);

    impl Company {
        pub const FACEBOOK: Self = Company(0i32);
        pub const WHATSAPP: Self = Company(1i32);
        pub const OCULUS: Self = Company(2i32);
        pub const INSTAGRAM: Self = Company(3i32);
    }

    impl Default for Company {
        fn default() -> Self {
            Company(fbthrift::__UNKNOWN_ID)
        }
    }

    impl<'a> From<&'a Company> for i32 {
        #[inline]
        fn from(x: &'a Company) -> i32 {
            x.0
        }
    }

    impl From<Company> for i32 {
        #[inline]
        fn from(x: Company) -> i32 {
            x.0
        }
    }

    impl From<i32> for Company {
        #[inline]
        fn from(x: i32) -> Self {
            Self(x)
        }
    }

    impl std::fmt::Display for Company {
        fn fmt(&self, fmt: &mut std::fmt::Formatter) -> std::fmt::Result {
            let s: &str = match *self {
                Company::FACEBOOK => "FACEBOOK",
                Company::WHATSAPP => "WHATSAPP",
                Company::OCULUS => "OCULUS",
                Company::INSTAGRAM => "INSTAGRAM",
                Company(x) => return write!(fmt, "{}", x),
            };
            write!(fmt, "{}", s)
        }
    }

    impl std::fmt::Debug for Company {
        fn fmt(&self, fmt: &mut std::fmt::Formatter) -> std::fmt::Result {
            write!(fmt, "{}::{}", "Company", self)
        }
    }

    impl std::str::FromStr for Company {
        type Err = failure::Error;

        fn from_str(string: &str) -> Result<Self, Self::Err> {
            match string {
                "FACEBOOK" => Ok(Company::FACEBOOK),
                "WHATSAPP" => Ok(Company::WHATSAPP),
                "OCULUS" => Ok(Company::OCULUS),
                "INSTAGRAM" => Ok(Company::INSTAGRAM),
                _ => failure::bail!("Unable to parse {} as {}", string, "Company"),
            }
        }
    }

    impl GetTType for Company {
        const TTYPE: TType = TType::I32;
    }

    impl<'a, P: ProtocolWriter> Serialize<P> for &'a Company {
        #[inline]
        fn write(self, p: &mut P) {
            p.write_i32(self.into())
        }
    }

    impl<P: ProtocolReader> Deserialize<P> for Company {
        #[inline]
        fn read(p: &mut P) -> failure::Fallible<Self> {
            Ok(Company::from(p.read_i32()?))
        }
    }

    impl Default for Internship {
        fn default() -> Self {
            Self {
                weeks: Default::default(),
                title: Default::default(),
                employer: None,
            }
        }
    }

    impl GetTType for Internship {
        const TTYPE: TType = TType::Struct;
    }

    impl<'a, P: ProtocolWriter> Serialize<P> for &'a Internship {
        fn write(self, p: &mut P) {
            p.write_struct_begin("Internship");
            p.write_field_begin("weeks", TType::I32, 1);
            Serialize::write(&self.weeks, p);
            p.write_field_end();
            p.write_field_begin("title", TType::String, 2);
            Serialize::write(&self.title, p);
            p.write_field_end();
            if let Some(some) = &self.employer {
                p.write_field_begin("employer", TType::I32, 3);
                Serialize::write(some, p);
                p.write_field_end();
            }
            p.write_field_stop();
            p.write_struct_end();
        }
    }

    impl<P: ProtocolReader> Deserialize<P> for Internship {
        fn read(p: &mut P) -> failure::Fallible<Self> {
            let mut field_weeks = None;
            let mut field_title = None;
            let mut field_employer = None;
            let _ = p.read_struct_begin(|_| ())?;
            loop {
                let (_, fty, fid) = p.read_field_begin(|_| ())?;
                match (fty, fid as i32) {
                    (TType::Stop, _) => break,
                    (TType::I32, 1) => field_weeks = Some(Deserialize::read(p)?),
                    (TType::String, 2) => field_title = Some(Deserialize::read(p)?),
                    (TType::I32, 3) => field_employer = Some(Deserialize::read(p)?),
                    (fty, _) => p.skip(fty)?,
                }
                p.read_field_end()?;
            }
            p.read_struct_end()?;
            Ok(Self {
                weeks: field_weeks.unwrap_or_default(),
                title: field_title.unwrap_or_default(),
                employer: field_employer,
            })
        }
    }

    impl Default for UnEnumStruct {
        fn default() -> Self {
            Self {
                city: Default::default(),
            }
        }
    }

    impl GetTType for UnEnumStruct {
        const TTYPE: TType = TType::Struct;
    }

    impl<'a, P: ProtocolWriter> Serialize<P> for &'a UnEnumStruct {
        fn write(self, p: &mut P) {
            p.write_struct_begin("UnEnumStruct");
            p.write_field_begin("city", TType::I32, 1);
            Serialize::write(&self.city, p);
            p.write_field_end();
            p.write_field_stop();
            p.write_struct_end();
        }
    }

    impl<P: ProtocolReader> Deserialize<P> for UnEnumStruct {
        fn read(p: &mut P) -> failure::Fallible<Self> {
            let mut field_city = None;
            let _ = p.read_struct_begin(|_| ())?;
            loop {
                let (_, fty, fid) = p.read_field_begin(|_| ())?;
                match (fty, fid as i32) {
                    (TType::Stop, _) => break,
                    (TType::I32, 1) => field_city = Some(Deserialize::read(p)?),
                    (fty, _) => p.skip(fty)?,
                }
                p.read_field_end()?;
            }
            p.read_struct_end()?;
            Ok(Self {
                city: field_city.unwrap_or_default(),
            })
        }
    }

    impl Default for Range {
        fn default() -> Self {
            Self {
                min: Default::default(),
                max: Default::default(),
            }
        }
    }

    impl GetTType for Range {
        const TTYPE: TType = TType::Struct;
    }

    impl<'a, P: ProtocolWriter> Serialize<P> for &'a Range {
        fn write(self, p: &mut P) {
            p.write_struct_begin("Range");
            p.write_field_begin("min", TType::I32, 1);
            Serialize::write(&self.min, p);
            p.write_field_end();
            p.write_field_begin("max", TType::I32, 2);
            Serialize::write(&self.max, p);
            p.write_field_end();
            p.write_field_stop();
            p.write_struct_end();
        }
    }

    impl<P: ProtocolReader> Deserialize<P> for Range {
        fn read(p: &mut P) -> failure::Fallible<Self> {
            let mut field_min = None;
            let mut field_max = None;
            let _ = p.read_struct_begin(|_| ())?;
            loop {
                let (_, fty, fid) = p.read_field_begin(|_| ())?;
                match (fty, fid as i32) {
                    (TType::Stop, _) => break,
                    (TType::I32, 1) => field_min = Some(Deserialize::read(p)?),
                    (TType::I32, 2) => field_max = Some(Deserialize::read(p)?),
                    (fty, _) => p.skip(fty)?,
                }
                p.read_field_end()?;
            }
            p.read_struct_end()?;
            Ok(Self {
                min: field_min.unwrap_or_default(),
                max: field_max.unwrap_or_default(),
            })
        }
    }

    impl Default for struct1 {
        fn default() -> Self {
            Self {
                a: Default::default(),
                b: Default::default(),
            }
        }
    }

    impl GetTType for struct1 {
        const TTYPE: TType = TType::Struct;
    }

    impl<'a, P: ProtocolWriter> Serialize<P> for &'a struct1 {
        fn write(self, p: &mut P) {
            p.write_struct_begin("struct1");
            p.write_field_begin("a", TType::I32, 1);
            Serialize::write(&self.a, p);
            p.write_field_end();
            p.write_field_begin("b", TType::String, 2);
            Serialize::write(&self.b, p);
            p.write_field_end();
            p.write_field_stop();
            p.write_struct_end();
        }
    }

    impl<P: ProtocolReader> Deserialize<P> for struct1 {
        fn read(p: &mut P) -> failure::Fallible<Self> {
            let mut field_a = None;
            let mut field_b = None;
            let _ = p.read_struct_begin(|_| ())?;
            loop {
                let (_, fty, fid) = p.read_field_begin(|_| ())?;
                match (fty, fid as i32) {
                    (TType::Stop, _) => break,
                    (TType::I32, 1) => field_a = Some(Deserialize::read(p)?),
                    (TType::String, 2) => field_b = Some(Deserialize::read(p)?),
                    (fty, _) => p.skip(fty)?,
                }
                p.read_field_end()?;
            }
            p.read_struct_end()?;
            Ok(Self {
                a: field_a.unwrap_or_default(),
                b: field_b.unwrap_or_default(),
            })
        }
    }

    impl Default for struct2 {
        fn default() -> Self {
            Self {
                a: Default::default(),
                b: Default::default(),
                c: Default::default(),
                d: Default::default(),
            }
        }
    }

    impl GetTType for struct2 {
        const TTYPE: TType = TType::Struct;
    }

    impl<'a, P: ProtocolWriter> Serialize<P> for &'a struct2 {
        fn write(self, p: &mut P) {
            p.write_struct_begin("struct2");
            p.write_field_begin("a", TType::I32, 1);
            Serialize::write(&self.a, p);
            p.write_field_end();
            p.write_field_begin("b", TType::String, 2);
            Serialize::write(&self.b, p);
            p.write_field_end();
            p.write_field_begin("c", TType::Struct, 3);
            Serialize::write(&self.c, p);
            p.write_field_end();
            p.write_field_begin("d", TType::List, 4);
            Serialize::write(&self.d, p);
            p.write_field_end();
            p.write_field_stop();
            p.write_struct_end();
        }
    }

    impl<P: ProtocolReader> Deserialize<P> for struct2 {
        fn read(p: &mut P) -> failure::Fallible<Self> {
            let mut field_a = None;
            let mut field_b = None;
            let mut field_c = None;
            let mut field_d = None;
            let _ = p.read_struct_begin(|_| ())?;
            loop {
                let (_, fty, fid) = p.read_field_begin(|_| ())?;
                match (fty, fid as i32) {
                    (TType::Stop, _) => break,
                    (TType::I32, 1) => field_a = Some(Deserialize::read(p)?),
                    (TType::String, 2) => field_b = Some(Deserialize::read(p)?),
                    (TType::Struct, 3) => field_c = Some(Deserialize::read(p)?),
                    (TType::List, 4) => field_d = Some(Deserialize::read(p)?),
                    (fty, _) => p.skip(fty)?,
                }
                p.read_field_end()?;
            }
            p.read_struct_end()?;
            Ok(Self {
                a: field_a.unwrap_or_default(),
                b: field_b.unwrap_or_default(),
                c: field_c.unwrap_or_default(),
                d: field_d.unwrap_or_default(),
            })
        }
    }

    impl Default for struct3 {
        fn default() -> Self {
            Self {
                a: Default::default(),
                b: Default::default(),
                c: Default::default(),
            }
        }
    }

    impl GetTType for struct3 {
        const TTYPE: TType = TType::Struct;
    }

    impl<'a, P: ProtocolWriter> Serialize<P> for &'a struct3 {
        fn write(self, p: &mut P) {
            p.write_struct_begin("struct3");
            p.write_field_begin("a", TType::String, 1);
            Serialize::write(&self.a, p);
            p.write_field_end();
            p.write_field_begin("b", TType::I32, 2);
            Serialize::write(&self.b, p);
            p.write_field_end();
            p.write_field_begin("c", TType::Struct, 3);
            Serialize::write(&self.c, p);
            p.write_field_end();
            p.write_field_stop();
            p.write_struct_end();
        }
    }

    impl<P: ProtocolReader> Deserialize<P> for struct3 {
        fn read(p: &mut P) -> failure::Fallible<Self> {
            let mut field_a = None;
            let mut field_b = None;
            let mut field_c = None;
            let _ = p.read_struct_begin(|_| ())?;
            loop {
                let (_, fty, fid) = p.read_field_begin(|_| ())?;
                match (fty, fid as i32) {
                    (TType::Stop, _) => break,
                    (TType::String, 1) => field_a = Some(Deserialize::read(p)?),
                    (TType::I32, 2) => field_b = Some(Deserialize::read(p)?),
                    (TType::Struct, 3) => field_c = Some(Deserialize::read(p)?),
                    (fty, _) => p.skip(fty)?,
                }
                p.read_field_end()?;
            }
            p.read_struct_end()?;
            Ok(Self {
                a: field_a.unwrap_or_default(),
                b: field_b.unwrap_or_default(),
                c: field_c.unwrap_or_default(),
            })
        }
    }

    impl Default for union1 {
        fn default() -> Self {
            Self {
                i: Default::default(),
                d: Default::default(),
            }
        }
    }

    impl GetTType for union1 {
        const TTYPE: TType = TType::Struct;
    }

    impl<'a, P: ProtocolWriter> Serialize<P> for &'a union1 {
        fn write(self, p: &mut P) {
            p.write_struct_begin("union1");
            p.write_field_begin("i", TType::I32, 1);
            Serialize::write(&self.i, p);
            p.write_field_end();
            p.write_field_begin("d", TType::Double, 2);
            Serialize::write(&self.d, p);
            p.write_field_end();
            p.write_field_stop();
            p.write_struct_end();
        }
    }

    impl<P: ProtocolReader> Deserialize<P> for union1 {
        fn read(p: &mut P) -> failure::Fallible<Self> {
            let mut field_i = None;
            let mut field_d = None;
            let _ = p.read_struct_begin(|_| ())?;
            loop {
                let (_, fty, fid) = p.read_field_begin(|_| ())?;
                match (fty, fid as i32) {
                    (TType::Stop, _) => break,
                    (TType::I32, 1) => field_i = Some(Deserialize::read(p)?),
                    (TType::Double, 2) => field_d = Some(Deserialize::read(p)?),
                    (fty, _) => p.skip(fty)?,
                }
                p.read_field_end()?;
            }
            p.read_struct_end()?;
            Ok(Self {
                i: field_i.unwrap_or_default(),
                d: field_d.unwrap_or_default(),
            })
        }
    }

    impl Default for union2 {
        fn default() -> Self {
            Self {
                i: Default::default(),
                d: Default::default(),
                s: Default::default(),
                u: Default::default(),
            }
        }
    }

    impl GetTType for union2 {
        const TTYPE: TType = TType::Struct;
    }

    impl<'a, P: ProtocolWriter> Serialize<P> for &'a union2 {
        fn write(self, p: &mut P) {
            p.write_struct_begin("union2");
            p.write_field_begin("i", TType::I32, 1);
            Serialize::write(&self.i, p);
            p.write_field_end();
            p.write_field_begin("d", TType::Double, 2);
            Serialize::write(&self.d, p);
            p.write_field_end();
            p.write_field_begin("s", TType::Struct, 3);
            Serialize::write(&self.s, p);
            p.write_field_end();
            p.write_field_begin("u", TType::Struct, 4);
            Serialize::write(&self.u, p);
            p.write_field_end();
            p.write_field_stop();
            p.write_struct_end();
        }
    }

    impl<P: ProtocolReader> Deserialize<P> for union2 {
        fn read(p: &mut P) -> failure::Fallible<Self> {
            let mut field_i = None;
            let mut field_d = None;
            let mut field_s = None;
            let mut field_u = None;
            let _ = p.read_struct_begin(|_| ())?;
            loop {
                let (_, fty, fid) = p.read_field_begin(|_| ())?;
                match (fty, fid as i32) {
                    (TType::Stop, _) => break,
                    (TType::I32, 1) => field_i = Some(Deserialize::read(p)?),
                    (TType::Double, 2) => field_d = Some(Deserialize::read(p)?),
                    (TType::Struct, 3) => field_s = Some(Deserialize::read(p)?),
                    (TType::Struct, 4) => field_u = Some(Deserialize::read(p)?),
                    (fty, _) => p.skip(fty)?,
                }
                p.read_field_end()?;
            }
            p.read_struct_end()?;
            Ok(Self {
                i: field_i.unwrap_or_default(),
                d: field_d.unwrap_or_default(),
                s: field_s.unwrap_or_default(),
                u: field_u.unwrap_or_default(),
            })
        }
    }
}

pub mod errors {
    use failure::Fail;
    use fbthrift::ApplicationException;

    #[derive(Debug, Fail)]
    pub enum ErrorKind {
        #[fail(display = "Application exception: {:?}", _0)]
        ApplicationException(ApplicationException),
    }

    impl From<ApplicationException> for ErrorKind {
        fn from(exn: ApplicationException) -> Self {
            ErrorKind::ApplicationException(exn).into()
        }
    }
}
