![2차 로고](https://github.com/songwc3/2ndTeamProject/assets/133622405/f30f241b-cab8-4978-868b-d886c5a7c7b0)

# ⛅🚍🎥3차 팀프로젝트 : 
# Open API를 이용한 챗봇 + 사내 그룹웨어⛅🚍🎥
<br/>

## 📌프로젝트 개요
- 개발기간 : 2023. 10. 27 ~ 2023. 11. 15 <br/>
- 주제선정이유 : 직접 다니고있는만큼 다른 주제에 비해 더 익숙하고 학원의 전반적인 시스템에 대해
  익힐수 있는 기회라고 생각해서 학원이라는 주제를 선택했습니다. <br/>
  그리고 일상에서 흔히 접하고 많이 사용하는 날씨, 버스, 영화에 대한 API를 시나리오형 챗봇에 접목시켜 챗봇을 통해 사용자가 원하는 각각의 정보를 얻을수 있도록 했습니다.

<br/>

## 📂프로젝트 소개
- 2차프로젝트인 사내그룹웨어에 더해서 날씨, 버스, 영화 각각의 api를 이용해 데이터를 받아서 DB에 저장 후, 저장된 정보를 챗봇을 통해 볼수있는 사이트입니다.
- 학원의 임직원들이 각자의 출/퇴근을 기록하고, 일정 관리, 급여/근태 관리, 수강생 관리,
  그리고 관리자 권한의 경우 사원 관리를 할 수 있는 학원의 사내 그룹웨어입니다.
- Open API(일정과 우편번호, 네이버, 날씨, 버스, 영화)를 활용했습니다.
- 날씨, 버스, 영화에 대한 API의 데이터를 DB에 저장하고 저장된 데이터를 챗봇을 통해 활용했습니다.
- Github Actions와 AWS EC2를 이용해 CI/CD 환경을 구축했습니다.
<details>
<summary>메인페이지, PDF</summary>

<br/>

[3차_팀프로젝트 PDF](https://drive.google.com/file/d/1o4TLA30RmHTPCziJtc5LRjvprAtw_mik/view?usp=sharing)

![메인페이지](https://github.com/songwc3/2ndTeamProject/assets/133622405/9a500246-060b-4d50-8915-92b67b1a9f8d)
</details>

<br/>

## ✅프로젝트 실행 시 유의사항
<details>
<summary>사용법 보기</summary>

<br/>

### ❗&nbsp;이 프로젝트는 사내 그룹웨어로, 임직원들이 이용하는 사이트이기에 초기 화면에 계정 생성버튼을 별도로 만들지않았습니다. 따라서 아래 방법을 참고하시기 바랍니다.

<br/>

[IntelliJ 기준 실행방법]
1. 프로젝트 압축파일(.zip)을 다운로드합니다.
2. test 폴더 내부의 아래 사진에 표시된 'AcademyApplicationTests' 클래스를 실행합니다.
   ![1번](https://github.com/songwc3/2ndTeamProject/assets/133622405/9b518d9d-c7cc-488f-8dab-396ebe05f4a8)

<br/>

3. 'admin' 메서드를 실행합니다.
   ![2번](https://github.com/songwc3/2ndTeamProject/assets/133622405/462053e6-5ed5-4a84-83a2-5a7b650262b7)

<br/>

4. DB를 실행해 admin 계정이 추가된 것을 확인합니다.
   ![3번](https://github.com/songwc3/2ndTeamProject/assets/133622405/103bade4-1c39-4748-b503-1085cad4d163)

<br/>

5. DB에 정상적으로 계정이 추가됐다면, 로그인 시 아이디 : admin, 비밀번호 : 111을 입력하고 로그인합니다.
</details>

## 💻개발환경
- Language : Java11, Javascript, HTML5, CSS3
- Framework : Spring boot
- IDE : IntelliJ IDEA
- Template Engine : Thymeleaf
- Database : MySQL
- ORM : JPA
- Version Management : Git, Github

<br/>

## 📑DB 구조
<details>
<summary>상세보기(담당한 부분)</summary>

<br/>

- 사원(Employee) <br/>
  &nbsp;사원 당 하나의 프로필 사진만 등록가능하도록 설정했습니다. <br/>
  &nbsp;사원은 여러번의 출석 기록을 가질수있도록 설정했습니다. <br/>
  &nbsp;사원은 여러번의 결재 문서를 작성할수있도록 설정했습니다. <br/>
  &nbsp;사원은 다수의 결재자를 등록할수있도록 설정했습니다. <br/><br/>

- 수강생(Student) <br/>
  &nbsp;수강생 당 하나의 프로필 사진만 등록가능하도록 설정했습니다. <br/>
  &nbsp;수강생은 여러번의 출석 기록을 가질수있도록 설정했습니다. <br/><br/>
  [3차 DB ERD.pdf](https://github.com/songwc3/2ndTeamProject/files/13316326/3.DB.ERD.pdf)
  ![3차 DB ERD](https://github.com/songwc3/2ndTeamProject/assets/133622405/80a94f71-8de6-4ab3-b2a0-202931e9656b)
</details>

<br/>

## 🏓팀 구성 및 역할
### 🙋‍♂️팀장 송원철

<br/>

#### 로그인(Spring Security), 아이디 / 비밀번호 찾기
<details>
<summary>상세보기</summary>

<br/>

- 로그인(Spring Security) <br/>

![자동로그인 창](https://github.com/songwc3/2ndTeamProject/assets/133622405/733acee2-e9c3-4673-ab13-eced16fcfea5) <br/>
사이트 접속 시 먼저 마주하는 로그인 페이지입니다. <br/>
Spring security를 이용해 등록된 사원만 접속 가능하도록 설정했습니다. <br/>
ADMIN, EMPLOYEE 2개의 Role을 두어 ADMIN 권한만 사원을 추가할수있도록 설정했습니다.

<br/>

![자동로그인 시 쿠키](https://github.com/songwc3/2ndTeamProject/assets/133622405/b1c341fe-a102-43e8-ab37-89eb9dbccae2)
로그인 페이지에서 자동로그인에 체크하고 로그인을 하면 자동로그인 관련 쿠키가 생긴 것을 확인할수있습니다. <br/>
Security 설정에서 rememberMe 파라미터, 토큰 유효기간, 유저의 정보가 담긴 rememberMe 메서드를 추가함으로써 <br/>
페이지 종료 후 다시 사이트에 들어가도 로그인이 유지되는 자동로그인 기능을 구현했습니다.

<br/>

![자동로그인x 시 쿠키](https://github.com/songwc3/2ndTeamProject/assets/133622405/ab53a48b-bb85-43e7-8400-a66ab3fefead)
자동로그인에 체크를 안하면 자동로그인 관련 쿠키가 생기지 않는 것을 확인할수있습니다.

<br/>

````
// ================WebSecurityConfig==================
@Configuration
public static class EmployeeConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public SecurityFilterChain filterChainApp1(HttpSecurity http) throws Exception {
                http.csrf().disable();
        http.authorizeRequests()
                .antMatchers("/login","/movie/saveBoxOfficeData").permitAll()
                .antMatchers("/", "/dashboard", "/logout", "/employee/simple**", "/employee/detail/**", "/employee/update/**", "/employee/updateImage/**",
                        "/employee/delete/**", "/employee/confirmPassword/**", "/employee/changePassword/**", "/student/**", "/boards/**", "/notice/detail/**",
                        "/notice/list", "/attendance/**", "/approval/**", "/naver/**" ,"/post/**").authenticated()
                .antMatchers("/employee/join", "/employee/employeeList**", "/notice/create", "/notice/edit/**").hasAnyRole("ADMIN")

                .and()
                .formLogin()
                .loginPage("/login")
                .usernameParameter("employeeId")
                .passwordParameter("employeePassword")
                .loginProcessingUrl("/employee/login/post")
                .failureUrl("/login")
                .defaultSuccessUrl("/");

        // 자동로그인 기능
        http.rememberMe()
                .rememberMeParameter("rememberMe")
                .tokenValiditySeconds(86400 * 7) // 7일
                .alwaysRemember(false) // true 시 무조건 자동로그인, 기본값은 false
                .userDetailsService(userDetailsService());

        http.logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/")

                .and()
                .authenticationProvider(userAuthenticationProvider()); // 사용자 지정 로직을 통해 사용자를 인증하고 Spring Security에게 사용자 정보를 제공하는 역할
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsServiceImpl userDetailsService() {
        return new UserDetailsServiceImpl();
    }

    @Bean
    public DaoAuthenticationProvider userAuthenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService());
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }
===============================================
//==================UserDetailsServiceImpl=====================
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private EmployeeRepository employeeRepository; // db에서 사용자 정보 조회 위해 사용
    
    @Autowired
    private PasswordEncoder passwordEncoder; // 비밀번호 인코딩 위해 사용

    // Spring Security에서 사용자 정보를 가져오는 역할
    @Override
    public UserDetails loadUserByUsername(String employeeId) throws UsernameNotFoundException {

        EmployeeEntity employeeEntity = employeeRepository.findByEmployeeId(employeeId).orElseThrow(()->{
            throw new UsernameNotFoundException("아이디가 없습니다");
        });

        return new MyUserDetails(employeeEntity);
    }
}
===============================================
//==================MyUserDetails====================

public class MyUserDetails implements UserDetails{

    @Autowired
    private EmployeeEntity employeeEntity;

    // 일반
    public MyUserDetails(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collectRole = new ArrayList<>();
        collectRole.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return "ROLE_" + employeeEntity.getRole().toString(); // ROLE_
            }
        });
        return collectRole;
    }

    @Override
    public String getPassword() {
        return employeeEntity.getEmployeePassword();
    }

    @Override
    public String getUsername() {
        return employeeEntity.getEmployeeId();
    }

    // 계정 만료 여부
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // 계정 잠김 여부
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // 비밀번호 만료 여부
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    // 사용자 활성화 여부
    @Override
    public boolean isEnabled() {
        return true;
    }
}
````

<br/>

- 아이디 / 비밀번호 찾기

![아이디찾기](https://github.com/songwc3/2ndTeamProject/assets/133622405/8ced4778-2c47-4f0f-b918-4711c240541b)
사용자의 이메일과 휴대전화번호를 입력 받아 ajax로 요청을 보내면, findIdByEmailAndPhone 메서드를 이용해 <br/>
DB에 저장된 이메일, 휴대전화번호와 일치하는 아이디를 찾아 사용자에게 반환하는 구조입니다.

<br/>

![비밀번호 찾기](https://github.com/songwc3/2ndTeamProject/assets/133622405/5477fbf9-2251-4157-8fd1-5f28a03753da)
사용자의 이메일 주소와 휴대전화번호를 입력 받아 일치하면 ajax를 통해 클라이언트가 post 요청을 보내고, <br/>
createCode 메서드를 통해 임시비밀번호를 생성하여 DB에 저장하고 해당 이메일로 전송합니다. <br/>
이메일 내용은 setContext 메서드를 이용해 Thymeleaf 템플릿 엔진을 사용하여 HTML 템플릿을 적용합니다. <br/><br/>

````
//==================아이디 찾기======================
// controller
@GetMapping("/api/findId")
public String getShowFindIdForm() {
    return "employee/findId";
}

@PostMapping("/api/findId")
@ResponseBody
public ResponseEntity<String> postFindIdByEmailAndPhone(
        @RequestParam String employeeEmail,
        @RequestParam String employeePhone) {

    String foundId = employeeService.findIdByEmailAndPhone(employeeEmail, employeePhone);

    if (foundId != null) {
        return ResponseEntity.ok(foundId);
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("IdNotFound");
    }
}

// service
public String findIdByEmailAndPhone(String employeeEmail, String employeePhone) {

    EmployeeEntity employeeEntity = employeeRepository.findByEmployeeEmailAndEmployeePhone(employeeEmail, employeePhone);
    if (employeeEntity != null) {
        return employeeEntity.getEmployeeId();
    }
    return null;
}

// repository
EmployeeEntity findByEmployeeEmailAndEmployeePhone(String employeeEmail, String employeePhone);

// js
$.ajax({
    type: 'POST',
    url: $(this).attr('action'),
    data: $(this).serialize(),
    success: function(response) {
        if (response === 'IdNotFound') {
            showNotFoundId("일치하는 아이디를 찾을 수 없습니다.");
        } else {
            showFoundId(response);
        }
    },
    error: function(xhr, textStatus, errorThrown) {
        if (xhr.status === 404 && xhr.responseText === 'IdNotFound') {
            showNotFoundId("일치하는 아이디를 찾을 수 없습니다");
        }
    }
});
//====================비밀번호 찾기===========================
// controller
@PostMapping("/password")
public ResponseEntity postSendPasswordMail(@RequestBody EmailPostDto emailPostDto) {
    EmailMessageEntity emailMessageEntity = EmailMessageEntity.builder()
            .to(emailPostDto.getEmail())
            .subject("<<식스맨>> 임시 비밀번호 발급")
            .build();

    emailService.sendMail(emailMessageEntity, "password");
    
    return ResponseEntity.ok("{}"); // 빈 JSON 객체 반환, 클라이언트에서 JSON 파싱 오류를 피하기 위해 빈 JSON 객체로 응답을 반환하는 것이 일반적
}

// service
public String sendMail(EmailMessageEntity emailMessageEntity, String type) {

        String authNum = createCode(); // 인증번호, 인증번호가 생성되면 해당 번호를 'authNum'에 저장하여 이메일 내용에 삽입하거나 임시비밀번호로 설정함

        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        // 임시비밀번호 전송이 아닌 경우는 여기서 검사할 필요가 없습니다.
        if (type.equals("password")) {
            Optional<EmployeeEntity> optionalMemberEntity = employeeRepository.findByEmployeeEmail(emailMessageEntity.getTo());
            if (!optionalMemberEntity.isPresent()) {
                log.error("해당 이메일을 가진 회원을 찾을 수 없습니다: {}", emailMessageEntity.getTo());
                throw new RuntimeException("해당 이메일을 가진 회원을 찾을 수 없습니다.");
            }
            employeeService.SetTempPassword(emailMessageEntity.getTo(), authNum); // 임시비밀번호 저장
        }

        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, false, "UTF-8");
            mimeMessageHelper.setTo(emailMessageEntity.getTo()); // 메일 수신자
            mimeMessageHelper.setSubject(emailMessageEntity.getSubject()); // 메일 제목
            mimeMessageHelper.setText(setContext(authNum, type), true); // 메일 본문 내용, HTML 여부
            javaMailSender.send(mimeMessage);

            log.info("success");

            return authNum;

        } catch (MessagingException e) {
            log.info("fail");
            throw new RuntimeException(e);
        }
    }

    // 인증번호 및 임시 비밀번호 생성 메서드
    public String createCode() {
        Random random = new Random();
        StringBuffer key = new StringBuffer();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(4);

            switch (index) {
                case 0: key.append((char) ((int) random.nextInt(26) + 97)); break;
                case 1: key.append((char) ((int) random.nextInt(26) + 65)); break;
                default: key.append(random.nextInt(9));
            }
        }
        return key.toString();
    }

    // thymeleaf를 통한 html 적용
    public String setContext(String code, String type) {
        Context context = new Context();
        context.setVariable("code", code);
        return templateEngine.process(type, context);
    }

// html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<body>
<div style="margin:100px;">
    <h1> 안녕하세요.</h1>
    <h1> 그린컴퓨터아카데미 임직원 홈페이지 임시비밀번호입니다.</h1>
    <br>
    <p> 임시 비밀번호를 발급드립니다. 아래 발급된 비밀번호로 로그인해주세요. </p>
    <br>

    <div align="center" style="border:1px solid black; font-family:verdana;">
        <h3 style="color:blue"> 임시 비밀번호 입니다. </h3>
        <div style="font-size:130%" th:text="${code}"> </div>
    </div>
    <br/>
</div>
</body>
</html>
````

</details>

<br/>

#### 페이지별 권한 및 보안 설정(관리자, 일반사원 별 인사조회 화면 차등)
<details>
<summary>상세보기</summary>

<br/>

![관리자권한 사원목록](https://github.com/songwc3/2ndTeamProject/assets/133622405/06e4c9ce-0b77-4c27-abcb-7ab7f7821378)

![일반사원권한 사원목록](https://github.com/songwc3/2ndTeamProject/assets/133622405/ec63e6d9-c7e3-416c-af27-89b7b015f99c)
Spring security를 이용해 관리자 권한과 일반 사원 권한 각각 조회할수있는 정보의 범위를 다르게 설정했습니다. <br/>
HTML에서 sec:authorize를 사용하여 권한 별로 다른 페이지가 보이도록 설정했습니다.

<br/>

````
//==================권한별 인사목록조회 차등====================
<th:block sec:authorize="hasAnyRole('ADMIN')">
    <div class="human-resource">
        <span>H.R</span>
        <ul>
            <li>
                <a th:href="@{/employee/employeeList?page=0&subject=&search=}" data-ajax>
                    <img src="/images/index/snb/iconmonstr-user-21_fixed.svg" alt="인사관리 아이콘" class="menu-icon_small">
                    <span>인사관리</span>
                    <img src="/images/index/snb/selected_menu_img2.png" alt="선택 하이라이트 이미지" class="select-highlight">
                </a>
            </li>
        </ul>
    </div>
</th:block>
<th:block sec:authorize="hasAnyRole('EMPLOYEE')">
    <div class="human-resource">
        <span>H.R</span>
        <ul>
            <li>
                <a th:href="@{/employee/simpleEmployeeList?page=0&subject=&search=}" data-ajax>
                    <img src="/images/index/snb/iconmonstr-user-21_fixed.svg" alt="인사관리 아이콘" class="menu-icon_small">
                    <span>인사관리</span>
                    <img src="/images/index/snb/selected_menu_img2.png" alt="선택 하이라이트 이미지" class="select-highlight">
                </a>
            </li>
        </ul>
    </div>
</th:block>
````

<br/>

![페이지 별 보안설정](https://github.com/songwc3/2ndTeamProject/assets/133622405/45539c7b-f886-4ae0-a73d-70ffcf999b6e)
사원이 자신의 상세정보를 조회할 경우, URL에 자신의 사원고유번호가 들어가는데 <br/>
임의로 사원고유번호를 변경하여 다른 사원의 상세정보 페이지로 이동하는것을 막기위해 <br/>
Controller에서 myUserDetails 객체를 이용해 현재 로그인한 사용자가 아니라면 다른 사원의 페이지로 <br/>
넘어가지 못하도록 설정했습니다.

<br/>

````
//===================페이지별 보안 설정=======================
// controller
@GetMapping("/employee/detail/{employeeNo}")
public String getDetail(@PathVariable("employeeNo") Long employeeNo, Model model,
                        @AuthenticationPrincipal MyUserDetails myUserDetails){

    // 현재 사용자 권한이 admin인지 확인, admin 아니라면 true 반환
    if (!myUserDetails.getAuthorities().stream()
            .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {

        if (!myUserDetails.getEmployeeEntity().getEmployeeNo().equals(employeeNo)) {
            return "error";
        }
    }

    EmployeeDto employee = employeeService.detailEmployee(employeeNo);
    String employeeImageUrl = imageService.findImage(employee.getEmployeeId()).getImageUrl();

    model.addAttribute("employee", employee);
    model.addAttribute("employeeImageUrl", employeeImageUrl); // 이미지 url 모델에 추가
    return "employee/detail";
}
````
</details>

<br/>

#### 사원 및 수강생 CRUD
<details>
<summary>상세보기</summary>

<br/>

- 사원 등록

![사원추가 페이지](https://github.com/songwc3/2ndTeamProject/assets/133622405/acd67ad8-1410-4277-90ba-f9e51c6381ca) <br/>
Spring security를 이용해 관리자 권한을 가진 사원만 <br/>
사원 추가 버튼을 보이도록 설정해 관리자만 사원 등록이 가능합니다.
<br/><br/>

![수강생등록 페이지](https://github.com/songwc3/2ndTeamProject/assets/133622405/2ae95005-9a58-4de9-81f1-4b96f799714c) <br/>
수강생 등록은 관리자, 일반 사원 모두 등록 가능합니다.

<br/>

````
@GetMapping({"/employee/join"})
public String getJoin(EmployeeDto employeeDto, Model model){

    // 연도, 월, 일 데이터를 모델에 추가하여 뷰로 전달
    List<Integer> birthYears = new ArrayList<>();
    for (int year = 2023; year >= 1900; year--) { // 2023부터 1900까지 역순으로 추가
        birthYears.add(year);
    }
    List<Integer> birthMonths = new ArrayList<>();
    for (int month = 1; month <= 12; month++) {
        birthMonths.add(month);
    }
    List<Integer> birthDays = new ArrayList<>();
    for (int day = 1; day <= 31; day++) {
        birthDays.add(day);
    }

    model.addAttribute("birthYears", birthYears);
    model.addAttribute("birthMonths", birthMonths);
    model.addAttribute("birthDays", birthDays);

    log.info("employee method activated");

    return "employee/join";
}

@PostMapping("/api/employee/join")
public String postJoin(@Valid @ModelAttribute EmployeeDto employeeDto, BindingResult bindingResult){

    // 비밀번호 일치 확인
    if (!employeeDto.getEmployeePassword().equals(employeeDto.getConfirmPassword())) {
        bindingResult.rejectValue("confirmPassword", "error.confirmPassword", "비밀번호가 일치하지않습니다");
        return "employee/join";
    }

    // 생년월일 정보를 조합하여 하나의 문자열로 만듭니다.
    String birthDate = String.format("%04d%02d%02d", employeeDto.getBirthYear(), employeeDto.getBirthMonth(), employeeDto.getBirthDay());

    // employeeDto에 생년월일을 설정합니다.
    employeeDto.setEmployeeBirth(birthDate);

    employeeService.insertEmployee(employeeDto);

    return "redirect:/employee/employeeList?page=0&subject=&search=";
}

// service
@Transactional
public void insertEmployee(EmployeeDto employeeDto) {

    EmployeeEntity employeeEntity = EmployeeEntity.toEmployeeEntityInsert(employeeDto, passwordEncoder);
    Long employeeNo = employeeRepository.save(employeeEntity).getEmployeeNo();

    // 이미지 생성 및 저장
    ImageEntity imageEntity = new ImageEntity();
    imageEntity.setImageUrl("/employeeImages/default.png");
    imageEntity.setEmployee(employeeEntity);

    // ImageEntity를 db에 저장
    imageRepository.save(imageEntity);
}

// entity
public static EmployeeEntity toEmployeeEntityInsert(EmployeeDto employeeDto, PasswordEncoder passwordEncoder) {

    EmployeeEntity employeeEntity =new EmployeeEntity();

    employeeEntity.setEmployeeId(employeeDto.getEmployeeId());
    employeeEntity.setEmployeePassword(passwordEncoder.encode(employeeDto.getEmployeePassword()));
    employeeEntity.setEmployeeName(employeeDto.getEmployeeName());
    employeeEntity.setEmployeeGender(employeeDto.getEmployeeGender());
    employeeEntity.setEmployeePhone(employeeDto.getEmployeePhone());
    employeeEntity.setEmployeeEmail(employeeDto.getEmployeeEmail());
    employeeEntity.setEmployeeDep(employeeDto.getEmployeeDep());
    employeeEntity.setEmployeePosition(employeeDto.getEmployeePosition());
    employeeEntity.setEmployeeBirth(employeeDto.getEmployeeBirth());
    employeeEntity.setEmployeePostCode(employeeDto.getEmployeePostCode());
    employeeEntity.setEmployeeStreetAddress(employeeDto.getEmployeeStreetAddress());
    employeeEntity.setEmployeeDetailAddress(employeeDto.getEmployeeDetailAddress());
    employeeEntity.setRole(Role.EMPLOYEE);

    return employeeEntity;
}
````

<br/>

- 사원목록 조회 및 사원 상세보기

![관리자권한 사원목록](https://github.com/songwc3/2ndTeamProject/assets/133622405/2f4cb47a-432d-486a-ae4e-687cafacf30b)
Pageble 객체를 통해 페이징 정보를 받고 검색조건(subject)과 검색어(search)를 받아 <br/>
페이징과 검색이 가능한 회원 목록을 조회합니다. <br/><br/>

![상세정보](https://github.com/songwc3/2ndTeamProject/assets/133622405/8bbd9fa7-d927-4abc-89b7-e74f3b793223) <br/>
사원 고유번호(employeeNo)로 해당 회원이 있는지 DB에서 조회 후, <br/>
해당 사원이 있으면 저장된 사원의 정보를 나타냅니다.

<br/>

````
//======================== 사원목록 조회=========================
// controller(페이징, 검색 기능 조합)
@GetMapping("/employee/employeeList")
public String getEmployeeList(
        @PageableDefault(page=0, size=5, sort = "employeeNo", direction = Sort.Direction.DESC) Pageable pageable,
        Model model,
        @RequestParam(value = "subject", required = false) String subject,
        @RequestParam(value = "search", required = false) String search,
        @AuthenticationPrincipal MyUserDetails myUserDetails
) {

    if (myUserDetails != null) {
        EmployeeDto employee = employeeService.detailEmployee(myUserDetails.getEmployeeEntity().getEmployeeNo());
//            String employeeImageUrl = imageService.findImage(employee.getEmployeeId()).getImageUrl();

        model.addAttribute("employee", employee);
//            model.addAttribute("employeeImageUrl", employeeImageUrl);
        model.addAttribute("myUserDetails", myUserDetails);
    }

    Page<EmployeeDto> employeeList = employeeService.employeeList(pageable, subject, search);

    Long totalCount = employeeList.getTotalElements();
    int totalPage = employeeList.getTotalPages();
    int pageSize = employeeList.getSize();
    int nowPage = employeeList.getNumber();
    int blockNum = 10;

    int startPage = (int) ((Math.floor(nowPage / blockNum) * blockNum) + 1 <= totalPage ?
            (Math.floor(nowPage / blockNum) * blockNum) + 1 : totalPage);
    int endPage = (startPage + blockNum - 1 < totalPage ? startPage + blockNum - 1 : totalPage);

    model.addAttribute("employeeList", employeeList);
    model.addAttribute("startPage", startPage);
    model.addAttribute("endPage", endPage);

    return "employee/employeeList";
}

// service
public Page<EmployeeDto> employeeList(Pageable pageable, String subject, String search) {

    Page<EmployeeEntity> employeeEntities = null; // 기본 null값으로 설정

    if(subject.equals("employeeName")){
        employeeEntities = employeeRepository.findByEmployeeNameContaining(pageable, search);
    }else if(subject.equals("employeePhone")){
        employeeEntities = employeeRepository.findByEmployeePhoneContaining(pageable, search);
    }else if(subject.equals("employeeDep")) {
        employeeEntities = employeeRepository.findByEmployeeDepContaining(pageable, search);
    }else if(subject.equals("employeePosition")) {
        employeeEntities = employeeRepository.findByEmployeePositionContaining(pageable, search);
    }else if(subject.equals("employeeEmail")) {
        employeeEntities = employeeRepository.findByEmployeeEmailContaining(pageable, search);
    }else{
        employeeEntities = employeeRepository.findAll(pageable);
    }

    employeeEntities.getNumber();
    employeeEntities.getTotalElements();
    employeeEntities.getTotalPages();
    employeeEntities.getSize();

    Page<EmployeeDto> employeeDtos = employeeEntities.map(EmployeeDto::toEmployeeDto);

    return employeeDtos;
}

// Dto
public static EmployeeDto toEmployeeDto(EmployeeEntity employeeEntity) {
    EmployeeDto employeeDto=new EmployeeDto();
    employeeDto.setEmployeeNo(employeeEntity.getEmployeeNo());
    employeeDto.setEmployeeId(employeeEntity.getEmployeeId());
    employeeDto.setEmployeePassword(employeeEntity.getEmployeePassword());
    employeeDto.setEmployeeName(employeeEntity.getEmployeeName());
    employeeDto.setEmployeeGender(employeeEntity.getEmployeeGender());
    employeeDto.setEmployeePhone(employeeEntity.getEmployeePhone());
    employeeDto.setEmployeeEmail(employeeEntity.getEmployeeEmail());
    employeeDto.setEmployeeDep(employeeEntity.getEmployeeDep());
    employeeDto.setEmployeePosition(employeeEntity.getEmployeePosition());
    employeeDto.setEmployeeBirth(employeeEntity.getEmployeeBirth());
    employeeDto.setEmployeePostCode(employeeEntity.getEmployeePostCode());
    employeeDto.setEmployeeStreetAddress(employeeEntity.getEmployeeStreetAddress());
    employeeDto.setEmployeeDetailAddress(employeeEntity.getEmployeeDetailAddress());
    employeeDto.setRole(employeeEntity.getRole());
    employeeDto.setCreateTime(employeeEntity.getCreateTime());
    employeeDto.setUpdateTime(employeeEntity.getUpdateTime());

    if (employeeEntity.getImage() != null && employeeEntity.getImage().getImageUrl() != null) {
        employeeDto.setImageUrl(employeeEntity.getImage().getImageUrl());
    }

    return employeeDto;
}
===============================================
//=======================사원 상세조회=========================
// controller
@GetMapping("/employee/detail/{employeeNo}")
public String getDetail(@PathVariable("employeeNo") Long employeeNo, Model model,
                        @AuthenticationPrincipal MyUserDetails myUserDetails){

    // 현재 사용자 권한이 admin인지 확인, admin 아니라면 true 반환
    if (!myUserDetails.getAuthorities().stream()
            .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {

        if (!myUserDetails.getEmployeeEntity().getEmployeeNo().equals(employeeNo)) {
            return "error";
        }
    }

    EmployeeDto employee = employeeService.detailEmployee(employeeNo);
    String employeeImageUrl = imageService.findImage(employee.getEmployeeId()).getImageUrl();

    model.addAttribute("employee", employee);
    model.addAttribute("employeeImageUrl", employeeImageUrl); // 이미지 url 모델에 추가
    return "employee/detail";
}

// service
public EmployeeDto detailEmployee(Long employeeNo) {

    Optional<EmployeeEntity> optionalEmployeeEntity = Optional.ofNullable(employeeRepository.findById(employeeNo).orElseThrow(() -> {
        return new IllegalArgumentException("조회할 사원이 없습니다");
    }));

    if (optionalEmployeeEntity.isPresent()) {
        return EmployeeDto.toEmployeeDto(optionalEmployeeEntity.get());
    }
    return null;
}

// Dto
public static EmployeeDto toEmployeeDto(EmployeeEntity employeeEntity) {
    EmployeeDto employeeDto=new EmployeeDto();
    employeeDto.setEmployeeNo(employeeEntity.getEmployeeNo());
    employeeDto.setEmployeeId(employeeEntity.getEmployeeId());
    employeeDto.setEmployeePassword(employeeEntity.getEmployeePassword());
    employeeDto.setEmployeeName(employeeEntity.getEmployeeName());
    employeeDto.setEmployeeGender(employeeEntity.getEmployeeGender());
    employeeDto.setEmployeePhone(employeeEntity.getEmployeePhone());
    employeeDto.setEmployeeEmail(employeeEntity.getEmployeeEmail());
    employeeDto.setEmployeeDep(employeeEntity.getEmployeeDep());
    employeeDto.setEmployeePosition(employeeEntity.getEmployeePosition());
    employeeDto.setEmployeeBirth(employeeEntity.getEmployeeBirth());
    employeeDto.setEmployeePostCode(employeeEntity.getEmployeePostCode());
    employeeDto.setEmployeeStreetAddress(employeeEntity.getEmployeeStreetAddress());
    employeeDto.setEmployeeDetailAddress(employeeEntity.getEmployeeDetailAddress());
    employeeDto.setRole(employeeEntity.getRole());
    employeeDto.setCreateTime(employeeEntity.getCreateTime());
    employeeDto.setUpdateTime(employeeEntity.getUpdateTime());

    if (employeeEntity.getImage() != null && employeeEntity.getImage().getImageUrl() != null) {
        employeeDto.setImageUrl(employeeEntity.getImage().getImageUrl());
    }

    return employeeDto;
}
````
<br/>

- 사원정보 수정

![수정화면](https://github.com/songwc3/2ndTeamProject/assets/133622405/8cdec7f4-2e92-4170-b6eb-f8de18e1bdbd) <br/>
사원 고유번호(employeeNo)로 해당 사원이 있는지 DB에서 조회하고,<br/>
있으면 수정된 entity 객체를 DB에 저장합니다.


![사원정보수정](https://github.com/songwc3/2ndTeamProject/assets/133622405/98e590d4-4ef8-4c77-a5b9-af0bffaa4621)
<br/>

````
//==========================사원정보 수정==============================
// controller
@PostMapping("/post/employee/update")
public String postUpdate(@Valid EmployeeDto employeeDto, BindingResult bindingResult, @AuthenticationPrincipal MyUserDetails myUserDetails) {

    // 생년월일 정보를 조합하여 하나의 문자열로 만듭니다.
    String birthDate = String.format("%04d%02d%02d", employeeDto.getBirthYear(), employeeDto.getBirthMonth(), employeeDto.getBirthDay());

    // MemberDto에 생년월일을 설정합니다.
    employeeDto.setEmployeeBirth(birthDate);

    int rs = employeeService.updateEmployee(employeeDto);

    if (rs == 1) {
        System.out.println("회원정보 수정 성공");
        return "redirect:/employee/detail/" + employeeDto.getEmployeeNo();

    } else {
        System.out.println("회원정보 수정 실패");
        return "employee/update";
    }
}

// service
public int updateEmployee(EmployeeDto employeeDto) {

    Optional<EmployeeEntity> optionalEmployeeEntity = Optional.ofNullable(employeeRepository.findById(employeeDto.getEmployeeNo()).orElseThrow(() -> {
        return new IllegalArgumentException("수정할 사원정보가 없습니다");
    }));

    EmployeeEntity employeeEntity = EmployeeEntity.toEmployeeEntityUpdate(employeeDto);
    Long employeeNo = employeeRepository.save(employeeEntity).getEmployeeNo();

    Optional<EmployeeEntity> optionalEmployeeEntity1 = Optional.ofNullable(employeeRepository.findById(employeeNo).orElseThrow(() -> {
        return new IllegalArgumentException("수정할 사원정보가 없습니다");
    }));

    if (optionalEmployeeEntity1.isPresent()) {
        System.out.println("사원정보 수정 성공");
        return 1;

    } else {
        System.out.println("사원정보 수정 실패");
        return 0;
    }
}

// entity
public static EmployeeEntity toEmployeeEntityUpdate(EmployeeDto employeeDto) {

    EmployeeEntity employeeEntity =new EmployeeEntity();

    employeeEntity.setEmployeeNo(employeeDto.getEmployeeNo());
    employeeEntity.setEmployeeId(employeeDto.getEmployeeId());
    employeeEntity.setEmployeePassword(employeeDto.getEmployeePassword());
    employeeEntity.setEmployeeName(employeeDto.getEmployeeName());
    employeeEntity.setEmployeeGender(employeeDto.getEmployeeGender());
    employeeEntity.setEmployeePhone(employeeDto.getEmployeePhone());
    employeeEntity.setEmployeeEmail(employeeDto.getEmployeeEmail());
    employeeEntity.setEmployeeDep(employeeDto.getEmployeeDep());
    employeeEntity.setEmployeePosition(employeeDto.getEmployeePosition());
    employeeEntity.setEmployeeBirth(employeeDto.getEmployeeBirth());
    employeeEntity.setEmployeePostCode(employeeDto.getEmployeePostCode());
    employeeEntity.setEmployeeStreetAddress(employeeDto.getEmployeeStreetAddress());
    employeeEntity.setEmployeeDetailAddress(employeeDto.getEmployeeDetailAddress());
    employeeEntity.setRole(employeeDto.getRole());
    employeeEntity.setCreateTime(employeeDto.getCreateTime());
    employeeEntity.setUpdateTime(employeeDto.getUpdateTime());

    return employeeEntity;
}
````
<br/>

- 사원정보 삭제

![사원 정보 삭제](https://github.com/songwc3/2ndTeamProject/assets/133622405/49bcb3ec-8ee5-4114-98b2-5905661dea5d)
사원 삭제는 Spring security를 이용해 관리자 권한만 삭제 가능하도록 설정했고 이후 사용자의 실수 혹은 보안을 위해 <br/>
로그인중인 관리자의 비밀번호를 입력해야만 삭제가 되도록 구현했습니다. <br/>
삭제 페이지의 URL에도 해당 사원의 고유번호가 들어가 myUserDetails 객체를 이용해 <br/>
관리자 권한이 아니라면 들어갈수없도록 설정했습니다.

<br/>

````
//========================사원정보 삭제===========================
// controller
@GetMapping("/employee/delete/{employeeNo}")
public String getDelete(@PathVariable("employeeNo") Long employeeNo, @AuthenticationPrincipal MyUserDetails myUserDetails){

    if (!myUserDetails.getAuthorities().stream()
            .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN"))) {

        if (!myUserDetails.getEmployeeEntity().getEmployeeNo().equals(employeeNo)) {
            return "error";
        }
    }

    int rs=employeeService.deleteEmployee(employeeNo);

    if (rs==1) {
        System.out.println("사원 삭제 성공");
        return "redirect:/employee/employeeList?page=0&subject=&search=";

    }else{
        System.out.println("사원 삭제 실패");
        return "redirect:/";
    }
}

// service
public int deleteEmployee(Long employeeNo) {

    Optional<EmployeeEntity> optionalEmployeeEntity = Optional.ofNullable(employeeRepository.findById(employeeNo).orElseThrow(() -> {
        return new IllegalArgumentException("삭제할 사원번호가 없습니다");
    }));

    employeeRepository.delete(optionalEmployeeEntity.get());

    Optional<EmployeeEntity> optionalEmployeeEntity1 = employeeRepository.findById(employeeNo);

    if (!optionalEmployeeEntity1.isPresent()) {
        return 1;
    } else {
        return 0;
    }
}
===============================================
//================사원정보 삭제 시 관리자 비밀번호 확인====================
// controller
@PostMapping("/api/employee/checkAdminPassword")
@ResponseBody
public Map<String, Boolean> postCheckAdminPassword(@RequestParam("currentPassword") String currentPassword) {

    // 현재 로그인한 유저의 정보를 가져옴
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

    if (authentication != null && authentication.getPrincipal() instanceof UserDetails) {
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String employeeId = userDetails.getUsername();

        // username을 이용하여 현재 로그인한 유저의 정보를 가져옴 (UserDetailsService 사용)
        MyUserDetails currentUserDetails = (MyUserDetails) userDetailsService.loadUserByUsername(employeeId);

        // 현재 입력한 비밀번호와 현재 로그인한 유저의 비밀번호를 비교
        boolean valid = passwordEncoder.matches(currentPassword, currentUserDetails.getPassword());

        Map<String, Boolean> response = new HashMap<>();
        response.put("valid", valid);
        return response;
    } else {
        // 사용자가 로그인하지 않은 경우 또는 인증이 실패한 경우
        Map<String, Boolean> response = new HashMap<>();
        response.put("valid", false);
        return response;
    }
}

// js
function deleteEmployee(employeeNo) {
    if (employeeNo !== null) {
        $.ajax({
            type: "GET",
            url: "/employee/delete/" + employeeNo,
            success: function (data) {
                const redirection = document.getElementById('redirection');
                redirection.click();
            },
            error: function () {
                alert("사원 삭제에 실패했습니다.");
            }
        });
    }
}
````
</details>
<br/>

#### 네이버 API를 이용한 조직도 불러오기
<details>
<summary>상세보기</summary>

<br/>

![네이버 api 조직도 불러오기](https://github.com/songwc3/2ndTeamProject/assets/133622405/05180e5b-8d78-47e4-ba86-c189a122370a)
네이버 API를 이용해 네이버 워크플레이스에서 설정한 조직도를 가져오는 영상입니다. <br/>
인증서버에서 필요로 하는 각 정보를 담아 인증서버로 인증코드에 대한 요청을 보내고 <br/>
인증서버에서는 클라이언트에게 인증코드를 전달하고 전달받은 코드로 액세스토큰과 리프레시토큰을 요청해 </br>
전달받은 토큰을 이용해 API를 호출하는 구조입니다.

<br/>

````
//=========================네이버 API 이용한 조직도 불러오기============================
// controller
@Controller
public class NaverApiController {

	@Value("${navar.api.client-id}")
	String CLIENT_ID;

	@Value("${navar.api.client-secret}")
	String CLIENT_SECRET;

	//http://localhost:8095/naver/auth2
	@GetMapping("/naver/auth2")    // Redirect URL
	public String naver(String code, String state,Model model) throws Exception {
//		인가 코드 발급
		String apiURL="https://auth.worksmobile.com/oauth2/v2.0/token";
		apiURL += "?code="+code; // Authorization Code는 일회성이고, 유효 기간은 10분이다.
		apiURL += "&client_id="+CLIENT_ID;//Developer Console에서 발급받은 앱의 client ID
		apiURL += "&client_secret="+CLIENT_SECRET;//Developer Console에서 발급받은 앱의 client secret
		apiURL += "&grant_type=authorization_code";//"authorization_code"로 고정

		URL url=new URL(apiURL);
//		Access Token 발급
//		https://auth.worksmobile.com/oauth2/v2.0/token
		HttpURLConnection con=(HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		int responseCode=con.getResponseCode();

		String responseJSONData=null;

		if(responseCode == HttpURLConnection.HTTP_OK) {
			// 정상 실행 이면 데이터를 받아온다.
			responseJSONData=get(con.getInputStream());
			System.out.println("정상");
		}else {
			responseJSONData=get(con.getErrorStream());
			System.out.println("에러");
		}
		con.disconnect();

		ObjectMapper mapper=new ObjectMapper(); // JSON데이터를 java객체로 변환
		NaverTokenDTO dto=mapper.readValue(responseJSONData, NaverTokenDTO.class); // responseJSONData문자열을 NaverTokenDTO클래스 형식으로 매핑
		OrgResponse orgResponse=getOrgUnit(dto); // getOrgUnit 메서드 호출, dto 사용해서 조직정보 가져오고 orgResponse객체에 저장
		model.addAttribute("list", orgResponse.getOrgUnits()); // 전송 받은 데이터를 View
		return "naver/naver-auth2";
	}


	// 조직 연동 -> 실제 API 조직 get
	private OrgResponse getOrgUnit(NaverTokenDTO dto) throws IOException {

		String apiURL="https://www.worksapis.com/v1.0/orgunits?domainId=300112436";

		URL url=new URL(apiURL);
		HttpURLConnection con=(HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		//"Bearer {token}"
		con.setRequestProperty("Authorization", "Bearer "+dto.getAccess_token());

		int responseCode=con.getResponseCode();
		String responseJSONData=null;
		if(responseCode == HttpURLConnection.HTTP_OK) {
			responseJSONData=get(con.getInputStream()); // 값 리턴
			System.out.println(">>>정상");
		}else {
			responseJSONData=get(con.getErrorStream());
			System.out.println(">>>에러");
		}
		con.disconnect();
		System.out.println(responseJSONData);
		// JSON -> JAVA
		ObjectMapper mapper=new ObjectMapper();
		//JSON -> Java class
		OrgResponse reponse=mapper.readValue(responseJSONData, OrgResponse.class);
		return reponse;

	}

	//응답데이터를 스트림을 통해서 한줄씩읽어서 문자열로 리턴
	private String get(InputStream inputStream) throws IOException {
		InputStreamReader streamReader=new InputStreamReader(inputStream);
		BufferedReader lineReader=new BufferedReader(streamReader);

		StringBuilder responseBody=new StringBuilder();

		String data;
		while((data=lineReader.readLine()) != null) {
			responseBody.append(data);
		}

		lineReader.close();
		streamReader.close();
		return responseBody.toString();
	}

}

// html 인증 요청
<form action="https://auth.worksmobile.com/oauth2/v2.0/authorize" method="get">
    <input type="hidden" name="client_id" value="Rb47O1NVmQBZsQBT2KSU">
    <input type="hidden" name="redirect_uri" value="http://localhost:8095/naver/auth2">
    <input type="hidden" name="scope" value="directory,directory.read,orgunit,orgunit.read,user,user.read">
    <input type="hidden" name="response_type" value="code">
    <input type="hidden" name="state" value="test">
    <input type="submit" value="조직인증"  class="naverBtn">
</form>


// html 조직도
<!DOCTYPE html>
<html xmlns:th="https://www.thymeleaf.org">
<head>
  <meta charset="UTF-8">
  <title>네이버 API 조직도</title>
  <link rel="stylesheet" href="/css/naver/naver_auth2.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script>
	$(function(){
		$.each($(".group"),function(index,item){
			if($(item).children().length == 0){
				$(item).remove();
			}
		})
	});
  </script>
</head>
<body>
<div class="naver-group">
  <h1>그린컴퓨터아카데미</h1>
  <ul class="parent-node">
    <!-- 조직 연동 기본 구조 -->
    <li class="node" th:each="dto1:${list}" th:if="${#strings.isEmpty(dto1.parentOrgUnitId)}">
      <a th:text="${dto1.orgUnitName}"></a>
      <ul class="group">
        <li class="tree-node node" th:each="dto2:${list}" th:if="${dto1.orgUnitId eq dto2.parentOrgUnitId}">
          <a th:text="${dto2.orgUnitName}"></a>
          <ul class="group">
            <li class="tree-node node" th:each="dto3:${list}" th:if="${dto2.orgUnitId eq dto3.parentOrgUnitId}">
              <a th:text="${dto3.orgUnitName}"></a>
              <ul class="group">
                <li class="tree-node node" th:each="dto4:${list}" th:if="${dto3.orgUnitId eq dto4.parentOrgUnitId}">
                  <a th:text="${dto4.orgUnitName}"></a>
                </li>
              </ul>
            </li>
          </ul>
        </li>
      </ul>
    </li>
    <a th:href="@{/}">돌아가기</a>
  </ul>
</div>
</body>
</html>
````

<br/>

- 네이버 API 설정

![1  웍스 developers 사이드바](https://github.com/songwc3/2ndTeamProject/assets/133622405/96fec7f1-6f2f-4c07-94b2-5588e5a3e2bb) <br/>
네이버 NCloud, 콘솔에 진입 후 왼쪽 사이드바에서 Works 탭의 Developers를 클릭합니다.

<br/>

![2  developers console창](https://github.com/songwc3/2ndTeamProject/assets/133622405/e51176c3-ffc3-4092-a1b1-1668b1a3398e)
앱 추가를 누릅니다.

<br/>

![3  developers console 설정창](https://github.com/songwc3/2ndTeamProject/assets/133622405/1559b301-2292-4c42-90b2-83459407297a)
앱 정보를 입력하고 Client ID, Secret, Domain ID를 따로 적어서 저장합니다.

<br/>

![4  네이버 조직연동 설정](https://github.com/songwc3/2ndTeamProject/assets/133622405/4c10a39e-8188-45f1-bf12-a568531da706)
이후 왼쪽 사이드바에서 Workplace탭의 Developers에 들어가서 조직연동, 부서를 누르고 연동 설정을 'on'으로 바꿉니다.


</details>

<br/>

#### 날씨 API를 이용한 날씨 조회(DB 저장)
<details>
<summary>상세보기</summary>

<br/>

![날씨 api 조회](https://github.com/songwc3/2ndTeamProject/assets/133622405/6ff6c70e-da2c-4569-92aa-8dbaeb8388d3)
미리 설정해놓은 도시를 선택하면 OpenWeather 날씨 API를 호출해서 <br/> 
해당 도시의 데이터(JSON형식)를 받아 화면에 정보를 출력하고 ajax 또는 자바 객체로 DB에 저장합니다. <br/>
해당 도시의 좌표값을 이용해 카카오 지도 API에 해당 지역의 위치를 나타냅니다.

<br/>

````
//=====================날씨 api 조회(DB 저장)=========================
// controller
// ajax 이용 DB 저장
@PostMapping("/post/weather2")
    public Map<String, String> postWeather(@RequestBody WeatherApiDto weatherApiDto) {
        Map<String, String> response = new HashMap<>();

        if (weatherApiDto != null) {
            WeatherEntity weatherEntity = WeatherEntity.builder()
                    .cityName(weatherApiDto.getName())
                    .lat(weatherApiDto.getCoord().getLat())
                    .lon(weatherApiDto.getCoord().getLon())
                    .temp(weatherApiDto.getMain().getTemp())
                    .feels_like(weatherApiDto.getMain().getFeels_like())
                    .temp_max(weatherApiDto.getMain().getTemp_max())
                    .temp_min(weatherApiDto.getMain().getTemp_min())
                    .humidity(weatherApiDto.getMain().getHumidity())
                    .build();

            WeatherEntity savedEntity = weatherService.insertWeather(weatherEntity);

        }
        return response;
    }


// 자바 이용 DB 저장
@GetMapping("/api/weather_java")
public Map<String, String> weatherJava(String q) throws Exception {
    // String q = "Seoul"
    String appid = "31baec95fb6d389a7195e4f5dc84530b";
    String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + q + "&appid=" + appid;

    Map<String, String> requestHeaders = new HashMap<>();
    requestHeaders.put("Content-type", "application/json");

    // OpenApiUtil.get 메서드를 사용하여 API를 호출하고 응답을 가져옴
    String responseBody = OpenApiUtil.get(apiUrl, requestHeaders);
    System.out.printf(" << return " + responseBody);

    // API 응답 데이터를 데이터베이스에 저장하기 위해 insertResponseBody 메서드를 호출
    weatherService.insertResponseBody(responseBody);

    Map<String, String> weather = new HashMap<>();
    weather.put("weather", responseBody);

    return weather;
}

// service
// ajax 이용
public WeatherEntity insertWeather(WeatherEntity weatherEntity) {
        WeatherEntity existWeather = weatherRepository.findByCityName(weatherEntity.getCityName());

        if (existWeather == null) {
            return weatherRepository.save(weatherEntity);
        }else {
            return existWeather;
        }
    }

// java 이용
public WeatherApiDto insertResponseBody(String responseBody) {

    ObjectMapper objectMapper = new ObjectMapper();
    System.out.println(" <<  responseBody " + responseBody);

    WeatherApiDto response = null;
    try {
        // json 문자열데이터를 -> 클래스에 매핑
        response = objectMapper.readValue(responseBody, WeatherApiDto.class);
    } catch (Exception e) {
        e.printStackTrace();
    }

    System.out.println(" <<  WeatherApiDto " + response);

    WeatherEntity weatherEntity = WeatherEntity.builder()
            .cityName(response.getName())
            .lat(response.getCoord().getLat())
            .lon(response.getCoord().getLon())
            .temp(response.getMain().getTemp())
            .feels_like(response.getMain().getFeels_like())
            .temp_max(response.getMain().getTemp_max())
            .temp_min(response.getMain().getTemp_min())
            .humidity(response.getMain().getHumidity())
            .build();
    Optional<WeatherEntity> optionalWeatherEntity = Optional.ofNullable(weatherRepository.findByCityName(response.getName()));
    if (!optionalWeatherEntity.isPresent()) {
        weatherRepository.save(weatherEntity);
    }
    // list일 경우
    List<Weather> weatherList = response.getWeather()
            .stream()
            .collect(Collectors.toList());

    System.out.println(" <<  weatherList " + weatherList);

    for (Weather item : weatherList) {
        System.out.println(" <<  item " + item);
    }
    return response;
}

// js
// ajax 이용
const search = document.querySelector('#search');
const weatherListCon = document.querySelectorAll('.weather-list .con');

function weatherSearch() {
  weatherFn(search.value)
}


function weatherFn(cityVal) {
  weatherListCon.forEach(el => {
    el.innerText = "";
  });

    // 날씨 API에 요청을 보냅니다.
    let appUrl = `https://api.openweathermap.org/data/2.5/weather?q=${cityVal}&appid=31baec95fb6d389a7195e4f5dc84530b`; // 내 키

    $.ajax({
      url: appUrl,
      dataType: "json",
      type: "GET",
      success: function (result) {
        let lon = result.coord.lon; // 경도
        let lat = result.coord.lat; //위도

        $.ajax({
          url: '/post/weather2',
          dataType: "json",
          type: "POST",
          data: JSON.stringify(result),
          contentType: "application/json",
          success: function (response) {
            console.log(response);

            // 날씨 정보 업데이트 코드
            let $Icon = (result.weather[0].icon).substr(0, 2);
            let $weather_description = result.weather[0].main; // 현재 날씨 상태 (맑다)
            let $Temp = Math.floor(result.main.temp - 273.15) + 'º';
            let $city = cityVal;
            let $feels = Math.floor(result.main.feels_like - 273.15) + 'º';
            let $temp_max = Math.floor(result.main.temp_max - 273.15) + 'º';
            let $temp_min = Math.floor(result.main.temp_min - 273.15) + 'º';
            let $temperatureRange = `최저온도 ${$temp_min} / 최고온도 ${$temp_max}`;
            let $humidity = result.main.humidity + '%';

//            $('.weather_icon').html('<i class="' + weatherIcon[$Icon] + ' fa-5x" style="height : 150px; width : 150px;"></i>');
            $('.current_temp').html($Temp);
            $('.city .con').html($city);
            $('.city .description').html($weather_description);
            $('.temp .con').html($Temp);
            $('.feels_like .con').html($Temp);
            $('.temperatureRange .con').html($temperatureRange); // 최저, 최고온도
            $('.humidity .con').html($humidity);

            mapFn(lon, lat);
          },
          error: function (error) {
            console.error("에러 발생:", error);
          }
        });
      },
      error: function (error) {
        console.error("에러 발생:", error);
      }
    });
  }

// 초기에 서울 날씨 불러옴
  (
    () => {
      weatherFn("Seoul")
    }
  )();
  
function mapFn(lon, lat) {
    kakao.maps.load(function() {
      // 지도를 표시할 div와 지도 옵션 설정
      var mapContainer = document.getElementById('map'),
          mapOption = {
            center: new kakao.maps.LatLng(lat, lon), // 지도의 중심좌표
            level: 10 // 지도의 확대 레벨
          };

      // 지도 생성
      var map = new kakao.maps.Map(mapContainer, mapOption);

      // 마커 위치 설정 및 마커 생성
      var markerPosition = new kakao.maps.LatLng(lat, lon),
          marker = new kakao.maps.Marker({
            position: markerPosition
          });

      // 마커 지도에 표시
      marker.setMap(map);
    });
}

// js
// java 이용
const search = document.querySelector('#search');
const weatherList = document.querySelector('.weather-list');
const weatherListCon = document.querySelectorAll('.weather-list .con');


function weatherSearch() {
  weatherFn(search.value)
}

function weatherFn(cityVal) {
  weatherListCon.forEach(el => {
    el.innerText = "";
  });

  // 날씨 api - fontawesome 아이콘
  let weatherIcon = {
    '01': 'fas fa-sun',
    '02': 'fas fa-cloud-sun',
    '03': 'fas fa-cloud',
    '04': 'fas fa-cloud-meatball',
    '09': 'fas fa-cloud-sun-rain',
    '10': 'fas fa-cloud-showers-heavy',
    '11': 'fas fa-poo-storm',
    '13': 'far fa-snowflake',
    '50': 'fas fa-smog'
  };

  let appUrl = `/api/weather_java?q=${cityVal}`;

  $.ajax({
    url: appUrl,
    dataType: "json",
    type: "GET",
    success: function (result) {

      console.log(result);
      let jsonRs = JSON.parse(result.weather);

      console.log(jsonRs,' jsonRs');
      let lat = jsonRs.coord.lat; // 위도
      let lon = jsonRs.coord.lon; // 경도

      console.log(lon, lat);

      // 날씨 정보 업데이트 코드
      let $Icon = (jsonRs.weather[0].icon).substr(0, 2);
      let $weather_description = jsonRs.weather[0].main; // 현재 날씨 상태 (맑다)
      let $Temp = Math.floor(jsonRs.main.temp - 273.15) + 'º';
      let $city = cityVal;
      let $feels = Math.floor(jsonRs.main.feels_like - 273.15) + 'º';
      let $temp_max = Math.floor(jsonRs.main.temp_max - 273.15) + 'º';
      let $temp_min = Math.floor(jsonRs.main.temp_min - 273.15) + 'º';
      let $temperatureRange = `최저온도 ${$temp_min} / 최고온도 ${$temp_max}`;
      let $humidity = jsonRs.main.humidity + '%';

      $('.weather_icon').html('<i class="' + weatherIcon[$Icon] + ' fa-5x" style="height : 150px; width : 150px;"></i>');
      $('.current_temp').html($Temp);
      $('.city .con').html($city);
      $('.city .description').html($weather_description);
      $('.temp .con').html($Temp);
      $('.feels_like .con').html($Temp);
      $('.temperatureRange .con').html($temperatureRange); // 최저, 최고온도
      $('.humidity .con').html($humidity);

      mapFn(lon, lat);
    }
  })
}

(
  () => {
    weatherFn("Seoul")
  }
)();

function mapFn(lon, lat) {
    kakao.maps.load(function() {
      // 지도를 표시할 div와 지도 옵션 설정
      var mapContainer = document.getElementById('map'),
          mapOption = {
            center: new kakao.maps.LatLng(lat, lon), // 지도의 중심좌표
            level: 10 // 지도의 확대 레벨
          };

      // 지도 생성
      var map = new kakao.maps.Map(mapContainer, mapOption);

      // 마커 위치 설정 및 마커 생성
      var markerPosition = new kakao.maps.LatLng(lat, lon),
          marker = new kakao.maps.Marker({
            position: markerPosition
          });

      // 마커 지도에 표시
      marker.setMap(map);
    });
}
````
</details>

<br/>

#### 날씨 API를 이용한 챗봇 구현(DB 저장)
<details>
<summary>상세보기</summary>

<br/>

![날씨 챗봇](https://github.com/songwc3/2ndTeamProject/assets/133622405/9af08ce5-fba5-46bd-b505-4ae8139caebe)
챗봇을 실행하고 날씨를 선택해 원하는 도시를 영문으로 입력하면 입력한 도시가 <br/>
OpenWeather API 호출 URL에 입력되어 해당 도시의 날씨 정보를 가져오고 JSON 형식의 데이터를 <br/>
자바 객체로 변환해 DB에 저장합니다. <br/>
이후 설정해놓은 챗봇 시나리오에 의해 해당 도시의 날씨 정보를 챗봇 화면에 출력합니다. 

<br/>

````
//===================날씨 api 이용 챗봇(DB 저장)=========================
// js
// 날씨, 버스, 영화 공통 챗봇 스크립트 코드
// imports
import { addMovieMessageToLog } from '/js/chatbot2/movie.js';
import { sendMovieMessage } from '/js/chatbot2/movie.js';

import { addBusMessageToLog } from '/js/chatbot2/bus.js';
import { sendBusMessage } from '/js/chatbot2/bus.js';

import { addWeatherMessageToLog } from '/js/chatbot2/weather.js'; // 송원철
import { sendWeatherMessage } from '/js/chatbot2/weather.js'; // 송원철


document.addEventListener('DOMContentLoaded', function() {

    const chatbot = document.getElementById('chatbot');
    const chatbotLog = document.querySelector('.chatbot_log');
    let isChatbotInit = true; // 초기 메시지 출력용 플래그
    let askingAbout; // 질문 범주 저장용 변수 (영화, 날씨, 버스) -> DB와 대조
    let responseType; // 질문에 대한 답변 방법 (TEXT, VALUE)
    let askingFor; // 세부 범주
    let previousSelectionIds = []; // 뒤로가기를 위한 이전 id 저장용


    // 챗봇 열고 닫기 관련 로직 =============================================================================================
    
    // 챗봇 가시성 여부
    document.addEventListener('click', function(e) {
        const chatbotButton = e.target.closest('#chatbot_icon');
        const clickedInsideChatbot = e.target.closest('#chatbot');
    
        if (chatbotButton) {
            toggleChatbot();
            e.stopPropagation();
        } else if (!clickedInsideChatbot) {
            hideChatbot();
        }
    });

    // 챗봇 버튼 함수
    async function toggleChatbot() {
        const isChatbotVisible = chatbot.style.display === 'block';
        chatbot.style.display = isChatbotVisible ? 'none' : 'block';
    
        // 챗봇이 숨겨져 있었고 초기화되지 않았다면 시나리오 표시
        if (!isChatbotVisible && isChatbotInit) {
            await displayScenarioAndSelections(0);
            isChatbotInit = false;
            console.log('isChatbotInit : ', isChatbotInit);
        }
    }
    
    // 챗봇 바깥 클릭 시 숨기기 함수
    function hideChatbot() {
        if (chatbot.style.display === 'block') {
            chatbot.style.display = 'none';
        }
    }
  
    // ==================================================================================================================


    // 선택지 관련 로직 ====================================================================================================
    
    // 선택지 클릭시
    document.addEventListener('click', function(e) {
        if (e.target.classList.contains('selection_box')) {
            handleSelectionClick(e);
        }
    });

    // 선택지 처리 로직
    function handleSelectionClick(event) {
        const selectionText = event.target;
        const selectionId = selectionText.getAttribute('data-selection-id');
        const actionType = selectionText.getAttribute('data-selection');
        
        addMessageToLog(selectionText.textContent, 'user');
        
        if (selectionId) { // 선택지 선택시
            const scenarioId = selectionText.getAttribute('data-scenario-id');
            askingFor = selectionText.getAttribute('data-asking-for');
            console.log('askingFor : ', askingFor);
            previousSelectionIds.push(scenarioId);
            displayScenarioAndSelections(selectionId);
        } else if (actionType === 'back') { // 뒤로가기 선택시
            if (previousSelectionIds.length > 0) {
                const previousScenarioId = previousSelectionIds.pop();
                displayScenarioAndSelections(previousScenarioId);
            } else {
                console.error('뒤로 가기를 할 수 없습니다.');
            }
        } else if (actionType === 'end') { // 종료 선택시
            previousSelectionIds = [];
        } else {
            console.error('알 수 없는 선택지입니다.');
        }
    }
    
    // 선택지 생성 및 출력
    function showSelection(selections, scenarioId) {
        console.log('responseType', responseType);
        const selectionDiv = document.createElement('div');
        selectionDiv.classList.add('selection');
    
        selections.forEach(selection => {
            const selectionText = document.createElement('span');
            selectionText.textContent = selection.selection;
            selectionText.classList.add('selection_box');
            selectionText.setAttribute('data-selection-id', selection.id);
            selectionText.setAttribute('data-scenario-id', scenarioId);
            selectionText.setAttribute('data-asking-for', selection.selection);
            selectionDiv.appendChild(selectionText);
        });
    
        if (responseType === null) {
            // '종료' 혹은 '뒤로가기' 선택지를 출력
            const selectionToGoBackText = document.createElement('span');
            selectionToGoBackText.classList.add('selection_box');
            if (scenarioId == 0) {
                selectionToGoBackText.textContent = '종료';
                selectionToGoBackText.setAttribute('data-selection', 'end');
            } else {
                selectionToGoBackText.textContent = '뒤로가기';
                selectionToGoBackText.setAttribute('data-selection', 'back');
            }
            selectionDiv.appendChild(selectionToGoBackText);
        }else {
           responseType = 'TEXT';
        }
        
        chatbotLog.appendChild(selectionDiv);
        chatbotLog.scrollTop = chatbotLog.scrollHeight;
    }
    
    // ==================================================================================================================


    // 챗봇 입출력 관련 로직 ================================================================================================
    
    // 챗봇 내부쿼리 초기화
    function resetAskingQueries() {
        askingAbout = null;
        askingFor = null;
        displayScenarioAndSelections(0);
    }

    // 텍스트 입력으로 요청
    async function textRequest(inputValue) {

        if (inputValue.includes('영화')) {
            await sendMovieMessage(inputValue);
        } else if (inputValue.includes('날씨')) {
            await sendWeatherMessage(inputValue);
        } else if (inputValue.includes('버스')) {
            await sendBusMessage(inputValue);
        }

        resetAskingQueries();
    }

    // (봇에게 대답) 텍스트 입력으로 요청
    async function answerToBot(inputValue) {
        await redirectMessageTo(inputValue);
        resetAskingQueries();
    }

    // 챗봇 로그창에 송수신한 메시지 출력
    function addMessageToLog(message, sender) {
        const messageDiv = document.createElement('div');
        messageDiv.classList.add('message', sender);

        const messageText = document.createElement('p');
        messageText.classList.add('message_box');
        messageText.textContent = message;

        messageDiv.appendChild(messageText);
        chatbotLog.appendChild(messageDiv);
        chatbotLog.scrollTop = chatbotLog.scrollHeight; // 항상 최신 메시지 보이도록 스크롤 조정
    }

    // 챗봇 메시지 보내기. (엔터키)
    document.addEventListener('keyup', async function(event) {
        const chatbotInput = document.getElementById('chatbot_input');

        if (event.key === 'Enter' && event.target === chatbotInput) {
            const inputValue = event.target.value; // 입력된 값을 가져오고, input을 비웁니다
            event.target.value = ''; // 인풋창 초기화
            addMessageToLog(inputValue, 'user'); // 사용자 메시지 로그에 추가
            console.log('inputValue : ', inputValue);

            if (askingAbout && askingFor && responseType == 'TEXT') {
                answerToBot(inputValue);
            } else if (inputValue.includes('영화') || inputValue.includes('날씨') || inputValue.includes('버스')) {
                textRequest(inputValue);
            } else {
                sendMessage(inputValue);
            }
        }
    });

    // ==================================================================================================================

    // 통신 관련 로직 ======================================================================================================

    // 일반 챗봇 메세지 통신
    async function sendMessage(inputValue) {
        const message = inputValue.trim();
        if (message) {
            const response = await fetch(`/api/chatbot2/chat?message=${encodeURIComponent(message)}`);
            const text = await response.text();
            console.log(text); 
            addMessageToLog(text, 'bot');
        }
    }

    // 다른 js 파일에 있는 함수로 메세지를 보냄.
    async function redirectMessageTo(inputValue) {

        let requestMessageParts = [];
    
        if (askingAbout) requestMessageParts.push(askingAbout);
        if (askingFor) requestMessageParts.push(askingFor);
        if (inputValue) requestMessageParts.push(inputValue);
    
        const requestMessage = requestMessageParts.join(' ');
        console.log('requestMessage : ', requestMessage);
    
        const actions = {
            '영화': sendMovieMessage,
            '날씨': sendWeatherMessage,
            '버스': sendBusMessage
        };
        
        if (actions[askingAbout]) {
            await actions[askingAbout](requestMessage);
        } else {
            console.log('VALUE 값 송신 실패. 에러 발생.');
        }
    }

    // 시나리오 수신
    async function displayScenarioAndSelections(scenarioId) {
        console.log('scenarioId : ', scenarioId);
        try {
            const url = `/api/chatbot2/scenario?id=${scenarioId}`;
            const response = await fetch(url);
            if (!response.ok) {
                throw new Error('서버로부터 응답을 받지 못했습니다.');
            }
            const data = await response.json();
            
            responseType = data.scenario.scenarioResponseType;
            askingAbout = data.scenario.scenarioFor;
            console.log('responseType : ', responseType);
            console.log('askingAbout : ', askingAbout);

            if (!isChatbotInit && data.scenario.inform.includes('안녕하세요.')) {
                data.scenario.inform = removeGreeting(data.scenario.inform);
                console.log('if문 안의 인폼', data.scenario.inform);
            }

            console.log(data.scenario.inform);
            addMessageToLog(data.scenario.inform, 'bot'); 
            showSelection(data.selections, scenarioId);

            if (data.scenario.scenarioResponseType == 'VALUE') {
                await redirectMessageTo(null);
                resetAskingQueries();
            }

        } catch (error) {
            console.error('오류 발생:', error);
        }
    }

    function removeGreeting(inform) {
        return inform.replace('안녕하세요. ', '');
    }
});
// 날씨 스크립트 코드
const chatbotLog = document.querySelector('.chatbot_log');

let messageDiv; // messageDiv 변수를 함수 외부에서 선언
let messageText; // messageText 변수를 함수 외부에서 선언

function addWeatherMessageToLog(message, type) {
    messageDiv = document.createElement('div');
    messageDiv.classList.add('message', type);

    // 챗봇 응답 메시지 처리
        if (type === 'bot') {
            messageText = document.createElement('p');
            messageText.textContent = message;
            messageText.classList.add('message_box');
        } 

    messageDiv.appendChild(messageText);
    chatbotLog.appendChild(messageDiv);
    chatbotLog.scrollTop = chatbotLog.scrollHeight;
}

async function sendWeatherMessage(inputValue) {
    const message = inputValue.trim();
    if (message) {
        // addWeatherMessageToLog(message, 'user');
        const response = await fetch(`/api/chatbot2/chat?message=${encodeURIComponent(message)}`);

        if (response.status === 200) {
            const botResponse = await response.text();
            console.log(botResponse);
            addWeatherMessageToLog(botResponse, 'bot');
        } else {
            const errorMessage = await response.text();
            addWeatherMessageToLog(errorMessage, 'error');
        }
    }
}

export { addWeatherMessageToLog };
export { sendWeatherMessage };

// controller
@GetMapping("/chat")
    public String getChatResponse(@RequestParam String message) {

        log.info("챗봇 메세지 : {}", message);

        String botResponse = chatbotService.getResponse(message);

        return botResponse;

    }

// 챗봇 공통 서비스
@Slf4j
@Service
public class ChatbotService {

    private final HandlerMapping handlerMapping;
    private final AnswerService answerService;
    private final Komoran komoran;

    @Autowired
    public ChatbotService(HandlerMapping handlerMapping, AnswerService answerService, Komoran komoran) {
        this.handlerMapping = handlerMapping;
        this.answerService = answerService;
        this.komoran = komoran;
    }

    public String getResponse(String message) {
        MessageDTO messageDTO = nlpAnalyze(message);
        return messageDTO.getAnswer().getResponse();
    }

    public MessageDTO nlpAnalyze(String message) {
        KomoranResult result = komoran.analyze(message);
        log.info("message: {}", message);

        Set<String> nouns = new HashSet<>(result.getNouns());
        log.info("KOMORAN 분석 결과: {}", result.getList());
        nouns.forEach(noun -> log.info("추출된 명사: {}", noun));

        String response = generateResponse(nouns, message);
        AnswerDTO answer = AnswerDTO.builder().response(response).build();
        return MessageDTO.builder().answer(answer).build();
    }

    private String generateResponse(Set<String> nouns, String message) {
        for (String noun : nouns) {
            ServiceCommand command = handlerMapping.getCommand(noun);
            if (command != null) {
                return command.execute(message);
            }
        }
        // 특정 커맨드를 찾지 못했을 때, 기본 응답 서비스를 사용
        log.info("기본 응답 서비스로 전환: {}", message);
        return answerService.getResponseByTriggerKeyword(message);
    }

}

// 챗봇 메뉴서 날씨 선택 시 응답 처리하는 service
@Component
@KeywordHandler("날씨")
public class WeatherCommand implements ServiceCommand {

    private final WeatherChatbotService WeatherChatbotService;

    @Autowired
    public WeatherCommand(WeatherChatbotService WeatherChatbotService) {
        this.WeatherChatbotService = WeatherChatbotService;
    }

    @Override
    public String execute(String message) {
        return WeatherChatbotService.getWeatherForCity(message);
    }
}

// 날씨 챗봇 service
@RequiredArgsConstructor
@Slf4j
@Service
public class WeatherChatbotService {

    private final RestTemplate restTemplate;
    private final WeatherService weatherService;
    private final WeatherRepository weatherRepository;

    public String getWeatherForCity(String message) {
        String weatherApiUrl = "https://api.openweathermap.org/data/2.5/weather";
        String apiKey = "31baec95fb6d389a7195e4f5dc84530b";

        String newMessage = message.replace("날씨 현재 ", "");
        log.info("newMessage: " + newMessage);

        String apiUrl = weatherApiUrl + "?q=" + newMessage + "&appid=" + apiKey;
        log.info("apiUrl: " + apiUrl);

        Map<String, String> requestHeaders = new HashMap<>(); // 빈 맵 생성
        // HTTP GET 요청을 보내고 응답을 처리
        String response = OpenApiUtil.get(apiUrl, requestHeaders);

        WeatherApiDto weatherApiDto = processWeatherResponse(response);

        Optional<WeatherEntity> weatherInfo = Optional.ofNullable(weatherRepository.findByCityName(newMessage));
        if(weatherInfo.isPresent()){
            double tempKelvin = Double.parseDouble(weatherInfo.get().getTemp());
            double tempMaxKelvin = Double.parseDouble(weatherInfo.get().getTemp_max());
            double tempMinKelvin = Double.parseDouble(weatherInfo.get().getTemp_min());

            int tempCelsius = (int) (tempKelvin - 273.15);
            int tempMaxCelsius = (int) (tempMaxKelvin - 273.15);
            int tempMinCelsius = (int) (tempMinKelvin - 273.15);

            return "도시: " + weatherInfo.get().getCityName() + "\n"
                    + "현재온도: " + tempCelsius + "°C\n"
                    + "최고온도: " + tempMaxCelsius + "°C\n"
                    + "최저온도: " + tempMinCelsius + "°C\n"
                    + "습도: " + weatherInfo.get().getHumidity() + "%";
        }
        return null;
    }

    public WeatherApiDto processWeatherResponse(String responseBody) {
        ObjectMapper objectMapper = new ObjectMapper();
        log.info("API 응답 데이터: " + responseBody);

        try {
            WeatherApiDto response = objectMapper.readValue(responseBody, WeatherApiDto.class);
            log.info("WeatherApiDto: " + response);

            WeatherEntity weatherEntity = WeatherEntity.builder()
                    .cityName(response.getName())
                    .lat(response.getCoord().getLat())
                    .lon(response.getCoord().getLon())
                    .temp(response.getMain().getTemp())
                    .feels_like(response.getMain().getFeels_like())
                    .temp_max(response.getMain().getTemp_max())
                    .temp_min(response.getMain().getTemp_min())
                    .humidity(response.getMain().getHumidity())
                    .build();

            Optional<WeatherEntity> optionalWeatherEntity = Optional.ofNullable(weatherRepository.findByCityName(response.getName()));
            if (!optionalWeatherEntity.isPresent()) {
                weatherRepository.save(weatherEntity);
            }

            List<Weather> weatherList = response.getWeather()
                    .stream()
                    .collect(Collectors.toList());

            for (Weather item : weatherList) {
                log.info("Weather: " + item);
            }

            return objectMapper.readValue(responseBody, WeatherApiDto.class);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
````
</details>

<br/>

#### 팀 PPT 구조 작성
<details>
<summary>PPT 보기</summary>

<br/>

[3차_팀프로젝트 PDF](https://drive.google.com/file/d/1o4TLA30RmHTPCziJtc5LRjvprAtw_mik/view?usp=sharing)
</details>

<br/>

팀원 김** : 게시판 및 공지사항 관리, 영화 API를 이용한 챗봇 기능 구현 <br/>
팀원 노** : 결재 관리, CI/CD, 버스 API를 이용한 챗봇 기능 구현 <br/>
팀원 박** : 프론트엔드, 일정 관리(Fullcalendar API 이용), 챗봇 구조 설계, 영화 API를 이용한 챗봇 기능 구현 <br/>
팀원 이** : 근태 및 급여 관리, 버스 API를 이용한 챗봇 기능 구현
