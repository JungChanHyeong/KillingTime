package chanh.killingtime;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpen extends SQLiteOpenHelper {

    public DBOpen(Context context) {
        super(context, "db_quiz", null, 1);
    }

    // 최초 실행시 Data Base 한번만 생성
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE db_quiz"
                + "(id integer primary key autoincrement, "
                + "category TEXT, quiz TEXT, right INTEGER, answer1 TEXT, "
                + "answer2 TEXT, answer3 TEXT, answer4 TEXT);");

        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '다음중 올림픽 정식종목이 아닌것은?', 3, '유도', '태권도', '검도', '우슈');"); //1
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '유도의 종주국은?', 2, '한국', '일본', '태국', '중국');"); //2
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '핸드볼 한팀의 경기자 수는?', 3, '5명', '6명', '7명', '8명');"); //3
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '한국 프로농구의 공격제한 시간은?', 1, '24초', '28초', '30초', '32초');"); //4
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '축구에서 날아오는 공을 받아서 조절하는 기술은?', 2, '드리블', '트래핑', '헤딩', '골 키핑');"); //5
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '다음중 투기운동이 아닌것은?', 1, '럭비', '씨름', '복싱', '레슬링');"); //6
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '공으로 하는 운동이 아닌것은?', 4, '축구', '야구', '농구', '유도');"); //7
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '기구를 사용하는 운동이 아닌것은?', 4, '테니스', '배드민턴', '탁구', '태권도');"); //8
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '축구 인원원은 총 몇명?', 2, '10명', '11명', '12명', '13명');"); //9
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '리오날 메시가 있는 나라는?', 1, '아르헨티나', '스페인', '브라질', '한국');"); //10
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '농구는 몇 쿼터까지 있을까?', 3, '2', '3', '4', '5');"); //11
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '탁구의 최대 인원은?', 4, '1명', '2명', '3명', '4명');"); //12
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '배드민턴에서 세게 치는 것을 뭐라고 할까?', 1, '스매싱', '스파이크', '슈팅', '토스');"); //13
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '배구의 총 인원은?', 3, '4명', '5명', '6명', '7명');"); //14
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '여자 양궁의 막내는?', 2, '김보배', '기보배', '구보배', '고보배');"); //15
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '양궁이 한국에 들어온 시기는?', 4, '1956년', '1950년', '1592년', '1959년');"); //16
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '양궁의 유래 국가는?', 1, '몽골', '한국', '중국', '일본');"); //17
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '2010년에 새롭게 창단된 제 9구단은?', 3, '한화', '기아', '엔씨다이노스', '롯데자이언트');"); //18
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '2002년 한일 월드컵에서 골든슈를 받은 선수는?', 2, '히바우두', '호나우두(브라질)', '이영표', '박지성');"); //19
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '한국에서 첫번째로 홈런친 선수는?', 1, '이만수', '이만기', '강병규', '오승환');"); //20
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '배구 삼성화재에서 뛰었던 외국인 선수의 이름은?', 2, '안젤눈', '안젤코', '안젤입', '안젤귀');"); //21
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '수영 2008베이징 올림픽에서 박태환을 꺾은 선수는?', 4, '조오련', '김연아', '아사다마오', '펠프스');"); //22
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('스포츠', '김연아선수의 종목은?', 1, '피겨스케이팅', '스피드스케이팅', '인라인스케이팅', '스노보드');"); //23
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '핑클의 데뷔곡은 ()이다', 1, '블루레인', '영원한약속', '뱅뱅뱅', '베베');"); //24
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '국내 최초로 1000만 관객 돌파한 영화는?', 3, '사이렌', '비밀', '실미도', '성난변호사');"); //25
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '양현석이 운영하는 기획사의 이름은?', 2, 'GG', 'YG', 'KG', 'LG');"); //26
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '군 부대를 찾아가는 쇼 프로그램 이름은?', 4, '군 무대', '꿈의 무대', '환상의 무대', '우정의 무대');"); //27
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '빅뱅의 멤버가 아닌 사람은?', 2, '승리', 'Bottom', 'Top', '지디');"); //28
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '은지원이 리더로 속해 있었던 아이돌 그룹은?', 1, '젝스키스', '딥키스', '프렌치키스', 'HOT');"); //29
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '국내에서 외국영화 최초로 1000만 넘은 영화는?', 1, '아바타', '혹성탈출', '아마겟돈', '미션임파서블');"); //30
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '서태지와 아이들의 4집 앨범 타이틀곡은?', 3, '난 알아요', '캔디', '컴백홈', '울트라맨');"); //31
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '[넌 학생이고, 난 학생이야]의 대사의 드라마 남주인공은?', 2, '김제동', '김재원', '소지섭', '현빈');"); //32
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', 'KBS에서 이소라의 음악프로그램이었던 이름은?', 4, '이소라의 뮤직뱅크', '이소라의 스케치북', '이소라의 100분토론', '이소라의 프로포즈');"); //33
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '장동건의 부인은?', 1, '고소영', '고소미', '이민정', '하희라');"); //34
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '서울대 출신 연예인이 아닌 사람은?', 2, '이순재', '성시경', '장기하', '버벌진트');"); //35
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '무한도전의 초창기 이름은?', 3, '무리한 도전', '무의미한 도전', '무모한 도전', '무장한 도전');"); //36
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', 'SES의 멤버가 아닌 사람은?', 4, '바다', '슈', '유진', '보아');"); //37
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '[발리에서 생긴 일]에 나오는 여배우 이름은?', 1, '하지원', '수지', '강부자', '나문희');"); //38
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '김병만, 류탐등이 출연하는 야생 버라이어티 프로그램은?', 2, '무한도전', '정글의 법칙', '런닝맨', '체험삶의현장');"); //39
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '남자아이돌 그룹 비스트+엠블랙 의 총 멤버 수는?', 3, '9명', '10명', '11명', '12명');"); //40
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '백지영의 노래중 OST인 곡은?', 4, 'DASH', '총맞은것처럼', '사랑안해', '잊지말아요');"); //41
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '조용필의 노래가 아닌것은?', 1, '갈대의 순정', '모나리자', '단발머리', '여행을 떠나요');"); //42
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '영화 친구에서 니가가라 000에 해당 단어는?', 2, '제주도', '하와이', '울릉도', '대마도');"); //43
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '토이는 000의 1인 그룹명이다', 3, '김조한', '성시경', '유희열', '윤종신');"); //44
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '쌍둥이 자식을 둔 아버지가 아닌 연예인은?', 4, '이휘재', '정형돈', '이동국', '유재석');"); //45
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '응답하라 1994의 배경이 되는 하숙집 이름은?', 1, '신촌하숙', '서울하숙', '부산하숙', '수유하숙');"); //46
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '2013년 청룡영화제에서 남우주연상을 수상한 배우는?', 2, '이정재', '황정민', '조인성', '원빈');"); //47
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '엑소의 소속사는?', 3, 'JYP', 'YG', 'SM', 'KMU');"); //48
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '예능 인간의 조건에 출현하지 않은 개그맨은?', 4, '허경환', '김준현', '정태호', '유상민');"); //49
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '아시아의 별이라는 닉네임을 가지고 있는 가수는?', 1, '보아', '아이유', '수지', '현숙');"); //50
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '1000만 관객 돌파한 한국 영화가 아닌것은?', 2, '괴물', '웰컴투 동막골', '도둑들', '광해');"); //51
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '이병헌과 결혼한 여자 배우는?', 3, '이미자', '이미연', '이민정', '이모텝');"); //52
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '임수정, 소지섭이 출현했던 드라마는?', 4, '미안했다 사랑했다', '미안하다 사랑했다', '미안했다 사랑한다', '미안하다 사랑한다');"); //53
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '고현정과 최민수가 출현했던 드라마는?', 1, '모래시계', '모래시게', '모럐시게', '모럐시계');"); //54
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '에릭이 처음 맡은 드라마는?', 2, '너는 달린다', '나는 달린다', '나도 달린다', '하늘을 달리다');"); //55
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '신화 팬클럽 풍선 색깔은?', 3, '빨강색', '파랑색', '주황색', '흰색');"); //56
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '배용준, 최지우 주연의 드라마는?', 4, '봄연가', '여름연가', '가을연가', '겨울연가');"); //57
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '싸이의 데뷔곡은?', 1, '새', '강남스타일', '대디', '챔피언');"); //58
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '응답하라 1994 출연 배우가 아닌 사람은?', 2, '고아라', '서인국', '성동일', '유연석');"); //59
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', 'SBS에서 애정촌을 배경으로 한 프로그램은?', 3, '착', '쫙', '짝', '쨕');"); //60
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '레깅스 시구로 유명해진 스타는?', 4, '클라랴', '클란다', '클랄라', '클라라');"); //61
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '개그콘서트에 나오지 않은 여자 개그맨은?', 1, '홍윤화', '신보라', '김지민', '박나래');"); //62
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '슈퍼스타K 역대 우승자가 아닌 사람은?', 2, '서인국', '버스커버스커', '허각', '박재정');"); //63
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '1박2일 시즌1 PD이름은?', 3, '너영석', '노영석', '나영석', '누영석');"); //64
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '주군의 태양에서 귀신보는 역할을 맡은 배우는?', 4, '한지민', '전지현', '박보영', '공효진');"); //65
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '괴물을 제작한 감독은?', 1, '박찬욱', '임권택', '봉준호', '정찬형');"); //66
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '소녀시대,2pm,틴탑,씨스타,걸스데이,제국의아이들 합치면 몇명?', 2, '37명', '38명', '39명', '40명');"); //66
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('연예', '내 딸 금사월에 출연하는 여배우는?', 3, '십진희', '천진희', '백진희', '만진희');"); //67
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '광주 민주화 운동은 000 철폐와 전두환 퇴진을 요구했다', 4, '게엄령', '개엄령', '걔엄령', '계엄령');"); //68
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '골백번 고쳐 죽어에서 골은 ()를 뜻한다', 1, '백만번', '천만번', '십만번', '한번');"); //69
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '물이 어는 온도는?', 2, '-2도', '0도', '2도', '4도');"); //70
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '쉬리는 ()에서 서식하는 물고기이다.', 3, '바닷물', '수돗물', '민물', '변깃물');"); //71
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '술에서 사람을 취하게 하는 성분은?', 4, '에탄올', '메탄올', '염산', '알코올');"); //72
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '사랑니를 포함한 치아의 갯수는?', 1, '32개', '34개', '36개', '38개');"); //73
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '음식에 대한 두려움으로 사망까지 하는 병은?', 2, '대식증', '거식증', '중식증', '식곤증');"); //74
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '제주도 방언 감수다는 무엇을 의미하는가?', 3, '옵니다', '감사합니다', '갑니다', '안녕하세요');"); //75
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '명태를 말린걸 무엇이라 하는가?', 4, '국어', '명어', '망태', '북어');"); //76
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '중국의 수도는?', 1, '베이징', '홍콩', '상해', '상하이');"); //77
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '88년 서울 올림픽의 마스코트는?', 2, '사자', '호랑이', '강아지', '고양이');"); //78
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '흥부전에서 다리를 다친 새는?', 3, '참새', '비둘기', '제비', '독수리');"); //79
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '찬 공기는 ()간다', 4, '위로', '좌로', '우로', '아래로');"); //80
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '가야금을 만든 사람은?', 1, '우륵', '좌륵', '미륵', '계륵');"); //81
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '국회의원의 임기는?', 2, '3년', '4년', '5년', '6년');"); //82
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '기간을 나타내는 분기에서 1분기는?', 3, '12~2월', '2~4월', '1~3월', '11~1월');"); //83
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '음악에서 [안단테]는 무엇을 의미하나?', 4, '빠르게', '보통', '무지 느리게', '느리게');"); //84
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '아르헨티나의 전통춤은?', 1, '탱고', '왈츠', '차차차', 'R&B');"); //85
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '아무곳에도 쓸모가 없는 뜻의 말은?', 2, '잉어', '잉여', '무뇌충', '노답');"); //86
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '이혼한 여성/남성을 뜻하는 단어는?', 3, '이혼인', '싱글인', '돌싱', '자유인');"); //87
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '윤년의 주기는?', 4, '1년', '2년', '3년', '4년');"); //88
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '고인돌의 용도는?', 1, '무덤', '밥상', '책상', '침대');"); //89
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '해리포터의 작가는?', 2, '조앤 J 롤링', '조앤 K 롤링', '조앤 H 롤링', '조앤 K 롤링페이퍼');"); //90
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '영국의 수도는?', 3, '파리', '서울', '런던', '오사카');"); //90
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '저작권의 유지 기간은?', 4, '20년', '30년', '40년', '50년');"); //91
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '나폴레옹의 국적은?', 1, '프랑스', '한국', '일본', '중국');"); //92
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '일개미는 모두()다.', 2, '수컷', '암컷', '호구', '호갱');"); //93
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '0주고 약준다', 3, '돈', '진단서', '병', '처방전');"); //94
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '0 천 년에 용 된다', 4, '뱀', '도마뱀', '곱등이', '미꾸라지');"); //95
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '이웃집 () 흉도 많다.', 1, '며느리', '시누이', '아주머니', '아저씨');"); //96
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '나무칼로 ()를 베어도 모르겠다', 2, '코', '귀', '입', '눈');"); //97
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '남의 집 제사에 ()', 3, '인사하기', '경례하기', '절하기', '묵상하기');"); //98
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '수박 겉 00', 4, '할기', '핱기', '핡기', '핥기');"); //99
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '나라 ()도 잘라먹는다', 1, '고금', '고은', '고동', '중금');"); //100
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '똥 묻은 ()가 겨묻은 ()나무란다', 2, '게', '개', '놈', '년');"); //101
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '소문난 ()에 먹을 것 없다.', 3, '축제', '행사', '잔치', '식당');"); //102
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '닭 잡아 먹고 () 내민다', 4, '족발', '닭발', '목', '오리발');"); //103
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '못된 000 엉덩이에 뿔난다.', 1, '송아지', '망아지', '강아지', '고양이');"); //104
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '남의 잔치에 ()놓아라 배놓아라 한다', 2, '배', '감', '돈', '정');"); //105
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '() 살 버릇 여든까지 간다', 3, '한', '두', '세', '네');"); //106
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '까마귀 날자 () 떨어진다', 4, '운', '정', '감', '배');"); //107
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '6월 6일은 무슨 날인가?', 1, '현충일', '한글날', '어린이날', '국군의날');"); //108
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '다산콜센터의 전화번호는?', 2, '119', '120', '114', '112');"); //109
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '일본 원폭 피해 지역 이름은?', 3, '오사카', '도쿄', '히로시마', '동경');"); //110
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '육아휴직은 자녀의 나이가 만 ()세 이하여야 한다.', 4, '3세', '4세', '5세', '6세');"); //111
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '가슴 부위의 근육 이름은?', 1, '대흉근', '소흉근', '중흉근', '특대흉근');"); //112
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '000 무서워서 장 못 담글까', 2, '어머니', '구더기', '시누이', '며느리');"); //113
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '1박 2일의 방송사는?', 3, 'CTS', '투니버스', 'KBS', 'SBS');"); //114
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '1평은 몇 ()제곱미터이다', 4, '3.0', '3.1', '3.2', '3.3');"); //115
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '남성의 혼인 신고는 ()부터 가능하다', 1, '만18세', '만19세', '만20세', '만21세');"); //116
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '000이 무너지랴', 2, '바벨탑', '공든탑', '에펠탑', '다보탑');"); //117
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '혈중알코올농도가 000% 미만이면 음주운전이 아니다.', 3, '0.03', '0.04', '0.05', '0.06');"); //118
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '컴퓨터에서 1MB-> 0000KB 이다.', 4, '1021', '1022', '1023', '1024');"); //119
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '양악수술은 어느 부위를 교정하는 수술일까요?', 1, '턱', '광대', '목', '척추');"); //120
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '대한민국의 국목은?', 2, '감나무', '소나무', '배나무', '사과나무');"); //121
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '예금자 보호법에 의해 보호되는 금액은?', 3, '3000만원', '4000만원', '5000만원', '6000만원');"); //122
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '우리나라의 의무교육 기간은?', 4, '3년', '6년', '12년', '9년');"); //123
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '하늘의 () 따기', 1, '별', '감', '배', '벌');"); //124
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '전화기에 있는 번호를 다 곱하면?', 2, '10', '0', '100', '50');"); //125
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '낙타의 혹 속에 있는 것은?', 3, '물', '혈액', '지방', '모세혈관');"); //126
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '지구는 태양계의 몇 번째 행성인가?', 4, '4번째', '2번째', '5번째', '3번째');"); //127
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '코끼리 코는 () 이다.', 1, '근육', '지방', '손', '혈장');"); //128
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '학창시절 결석/조퇴 없으면 주는 상은?', 2, '개그상', '개근상', '밥상', '제사상');"); //128
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '개의 새끼는?', 3, '개새키', '개새끼', '강아지', '개시키');"); //129
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '세계에서 땅이 제일 큰 나라는?', 4, '미국', '중국', '캐나다', '러시아');"); //130
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '미국의 팝의 황제라 불리는 사람은?', 1, '마이클 잭슨', '마이클 조던', '마이콜', '마미콜');"); //131
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '우리나라 국보 1호는?', 2, '동대문', '남대문', '서대문', '집대문');"); //132
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '네잎클로버의 의미는?', 3, '식물', '풀', '행운', '4개의 잎');"); //133
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '범죄 발생 시 누르는 번호는?', 4, '119', '114', '120', '112');"); //134
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '00 먹고 속 차려라', 1, '냉수', '에프', '씨쁠', '디쁠');"); //135
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '[너자신을 알라]를 말한 사람은?', 2, '어머니', '소크라테스', '아버지', '할아버지');"); //136
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '애국가에서 [남산위에 저 소나무]는 몇 절 가사인가?', 3, '4절', '3절', '2절', '1절');"); //137
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '100원 짜리 동전에 표시된 인물은?', 4, '신사임당', '이황', '이이', '이순신');"); //138
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('상식', '매년 1월 1일 제야의 종 치는 횟수는?', 1, '33번', '34번', '35번', '36번');"); //139
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Accomplice', 1, '공범', '찬사', '고려', '받아들일 만한');"); //140
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Bear', 2, '호전적인', '~을 몸에 지니다', '~외에', '유익한');"); //141
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Carnival', 3, '탄수화물', '지원자', '사육제', '만평');"); //142
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Delve', 4, '대표', '지연', '시위하다', '파다');"); //143
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Eligible', 1, '자격이 있는', '저명한', '고상한', '멸종위기에 처한');"); //144
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Feat', 2, '요금', '위업', '수치', '피로');"); //145
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Go out', 3, '주다', '되돌아가다', '데이트하다', '굴복하다');"); //146
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Hectic', 4, '망설이는', '열이 나는', '심한', '매우 흥분한');"); //147
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Impose', 1, '부과하다', '저해하다', '시행하다', '실행하다');"); //148
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Withstand', 2, '운동하다', '견디다', '걱정하다', '나아가다');"); //149
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Jog', 3, '참여하다', '정당화하다', '일깨우다', '동의하다');"); //150
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Key', 4, '상아', '계약', '지부', '핵심');"); //151
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Lawn', 1, '잔디', '조경', '가죽', '휴가');"); //152
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Mainly', 2, '대부분', '주로', '게다가', '미리');"); //153
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Nonsense', 3, '품종', '소책자', '허튼소리', '예산');"); //154
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Obstruct', 4, '할 수 있다', '이용하다', '거대하다', '차단하다');"); //155
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Patent', 1, '특허', '붕괴', '담보', '동료');"); //156
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Purify', 2, '추구하다', '정제하다', '누르다', '중요하다');"); //157
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Rearrange', 3, '상기하다', '기억하다', '재정리하다', '분배하다');"); //158
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Rebust', 4, '위험한', '신속한', '현실적인', '튼튼한');"); //159
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Serve', 1, '제공하다', '나타나다', '나서다', '강조하다');"); //160
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Sink', 2, '상상하다', '침몰하다', '서명하다', '줄이다');"); //161
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Tenant', 3, '공식적인', '깨지기 쉬운', '임차인', '신선한');"); //162
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Turnover', 4, '버릇', '유죄', '초청', '거래액');"); //163
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Unoccupied', 1, '비어있는', '전통적인', '독튼한', '제한없는');"); //164
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Utensil', 2, '신분', '도구', '친절', '존경');"); //165
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Void', 3, '정확한', '틀린', '빈', '적당한');"); //166
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Yield', 4, '이겨내다', '궁금하다', '멋지다', '양보하다');"); //167
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Induce', 1, '유발하다', '빠지다', '늘리다', '수고하다');"); //168
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('영어', 'Harsh', 2, '흥분한', '가혹한', '망설이는', '보람있는');"); //169
        db.execSQL("insert into db_quiz (category ,quiz, right, answer1, answer2, answer3, answer4)"
                + " VALUES('Egg', '개발자가 아닌 사람은?', 4, '윤주호', '정찬형', '최준형', '고생했습니다');"); //170
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS db_quiz");
        onCreate(db);
    }
}
